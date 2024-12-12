package com.cloud.order.repository.impl;

import com.cloud.order.repository.ServiceRepository;
import com.cloud.order.util.ExecutorUtil;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
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
    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public ServiceRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }


    public int executeInsert(String fileFrom, String fileName) {
        String fileToError = fileFrom + "/error.sql";
        File[] files = new File(fileFrom).listFiles();
        ExecutorService executorInstance = ExecutorUtil.getExecutorInstance();
        executorInstance.submit(() -> Arrays.stream(files).parallel().forEach(filePath -> {
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

                    conx = conx.replace("ticketorder", "ran_flight")
                            .replace("umetrip_air_" + fileName + "_his", "ran_air_" + fileName);

                    String[] split = conx.split(", ");

                    if (length % 10000 == 0) {
                        System.out.println(Thread.currentThread().getName() + ":1w is over");
                    }

                    String sql = String.join(", ", split);
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
                System.err.println(absolutePath + "is over!");
            } catch (IOException e) {
                System.out.println(e);
            }
        }));
        try {
            if (!executorInstance.awaitTermination(4, TimeUnit.HOURS)) {
                System.err.println("线程池任务未能在指定时间内完成");
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }


        return 0;
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
}
