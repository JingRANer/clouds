package com.cloud.order.repository.impl;

import com.alibaba.nacos.common.utils.CollectionUtils;
import com.alibaba.nacos.common.utils.StringUtils;
import com.cloud.order.repository.po.CloudAirService;
import com.cloud.order.mapper.CloudAirServiceMapper;
import com.cloud.order.repository.SegmentRepository;
import com.cloud.order.repository.ServiceRepository;
import com.cloud.order.util.ExecutorUtil;
import com.cloud.order.util.RedisService;
import io.netty.util.internal.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: ServiceRepositoryImpl
 * @create: 2024-07-15 23:29
 **/

@Service
public class ServiceRepositoryImpl implements ServiceRepository {

    @Resource
    SegmentRepository segmentRepository;

    @Resource
    CloudAirServiceMapper mapper;

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    private RedisService redisService;

    @Autowired
    public ServiceRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int executeInsert(String fileFrom, String fileName) {
        String fileToError = fileFrom + "/error.sql";
        File[] files = new File(fileFrom).listFiles();

        ExecutorService executorInstance = ExecutorUtil.getExecutorInstance();
        executorInstance.submit(() -> Arrays.stream(files).parallel().forEach(filePath -> executeData(fileFrom, fileName, fileToError, filePath)));
        try {
            if (!executorInstance.awaitTermination(4, TimeUnit.HOURS)) {
                System.err.println("线程池任务未能在指定时间内完成");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        return 0;
    }

    @Override
    public List<CloudAirService> findByOrderNo(String orderNo) {
        List<CloudAirService> cloudAirServices = mapper.selectByOrderNo(orderNo);

        if(CollectionUtils.isEmpty(cloudAirServices)) {
            return new ArrayList<>();
        }

//        cloudAirServices.stream().forEach();
        return null;
    }

    private void executeData(String fileFrom, String fileName, String fileToError, File filePath) {
        try {
            String absolutePath = filePath.getAbsolutePath();
            String id = absolutePath.replace(fileFrom, "");
            if (!Pattern.matches("^\\d.*", id)) {
                return;
            }

            // 读取到缓冲区
            BufferedReader br = new BufferedReader(new FileReader(absolutePath));
            // 错误记录
            BufferedWriter bufferedErrorWriter = new BufferedWriter(new FileWriter(fileToError, true));

            String line;
            // 一次读入一行数据
            int length = 0;
            String conx = "";

            while ((line = br.readLine()) != null) {
                length++;
                if (!line.contains("INSERT")) {
                    conx += line;
                    System.err.println("error:" + conx);
                } else {
                    conx = line;
                }

                String[] values = conx.split("VALUES")[1].split(",");
                String name = values[2].replace("'", "").replace(" ","");
                String certNo = values[7].replace("'", "").replace(" ","");
                String phoneNum = values[10].replace("'", "").replace(" ","");
                String newName = getValue("NAME_" + name);
                String newCertNo = getValue("CERT_" + certNo);
                String newPhone = getValue("PHONE_" + phoneNum);
                String sql = conx.replace("ticketorder", "ran_flight")
                        .replace("umetrip_air_" + fileName + "_his", "ran_air_" + fileName)
                        .replace(name, newName)
                        .replace(phoneNum, newPhone)
                        .replace(certNo, newCertNo)
                ;

                if (length % 30000 == 0) {
                    System.out.println(Thread.currentThread().getName() + ":3w is over");
                }

                try {
                    int update = jdbcTemplate.update(sql);
                    if (update < 1) {
                        bufferedErrorWriter.write(sql);
                        bufferedErrorWriter.flush();
                        bufferedErrorWriter.newLine();
                    }
                } catch (Exception e) {
                    bufferedErrorWriter.write(sql);
                    bufferedErrorWriter.flush();
                    bufferedErrorWriter.newLine();
                }
            }
            System.err.println(absolutePath + " is over!");
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    private String getSql(String conx) {
        String[] values = conx.split("VALUES");
        String[] split = values[1].split(",");
        String s = values[0] + "VALUES(";
        for (int i = 0; i < split.length; i++) {
            s += "?,";
        }
        s = s.substring(0, s.length() - 1) + ")";
        return s;
    }

    private Object[] getArgs(String conx) {
        String[] values = conx.split("VALUES");
        String[] split = values[1].replace(";", "")
                .replace("(", "").replace(")", "")
                .split(", ");
        Object[] args = new Object[split.length];
        for (int i = 0; i < split.length; i++) {
            if (i == 0) {
                split[i] = split[i].replace(" ", "");
            }
            if (split[i].contains("'")) {
                args[i] = split[i].replace("'", "");
            } else if (split[i].equals("null")) {
                args[i] = "";
            } else {
                args[i] = Integer.valueOf(split[i]);
            }

        }

        return args;
    }

    private String getValue(String key) {
        String va = UUID.randomUUID().toString();
        redisService.setKey(key, va);

        String newKey = (String) redisService.getKey(key);
        if (StringUtils.isEmpty(newKey)) {
            System.err.println(key + ":is not save over");
            return va;
        }
        return newKey;
    }
}
