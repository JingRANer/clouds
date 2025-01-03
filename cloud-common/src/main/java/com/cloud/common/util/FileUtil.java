package com.cloud.common.util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Pattern;

/**
 * @ClassName : FileUtil
 * @Description :
 * @Author : jzy
 * @Date: 2021-12-21 16:53
 */

public class FileUtil {

    /**
     * 读取txt文件
     *
     * @param file 要读取文件路径。例：D://test.txt
     * @return
     */
    public static String readFile(String file) {
        String conx = "";
        try {
            FileReader reader = new FileReader(file);
            // 读取到缓冲区
            BufferedReader br = new BufferedReader(reader);
            String line;
            // 一次读入一行数据
            while ((line = br.readLine()) != null) {
                conx += line;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return conx;
    }

    public static void writeFile(String fileFrom, String fileTo) {
        String conx = "";
        try {
            FileWriter fileWriter = new FileWriter(fileTo, true);
            FileReader reader = new FileReader(fileFrom);
            // 读取到缓冲区
            BufferedReader br = new BufferedReader(reader);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);

            String line;
            // 一次读入一行数据
            int length = 0;
            while ((line = br.readLine()) != null) {
                if (!line.contains("INSERT")) {
                    conx += line;
                    System.err.println("error:" + conx);
                } else {
                    conx = line;
                }

                conx = conx.replace("ticketorder", "ran_flight");
                conx = conx.replace("umetrip_air_order_his", "ran_air_order");

                String[] split = conx.split(", ");
                if (split.length < 99) {
                    continue;
                }
                split[61] = "null";
                split[62] = "null";
                bufferedWriter.write(String.join(", ", split));
                bufferedWriter.flush();
                bufferedWriter.newLine();
            }


        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) {
        String path = "/Users/jingran/Desktop/Data/service_2022/";
        File rootDirectory = new File(path); // 替换为你的目录路径
        File[] files = rootDirectory.listFiles();
        for (File filePath : files) {
            String absolutePath = filePath.getAbsolutePath();
            String id = absolutePath.replace(path, "");

            if (!Pattern.matches("^\\d.*", id)) {
                continue;
            }

            writeFile(absolutePath,
                    "/Users/jingran/Desktop/Data/2022/" + "service_all.sql");

        }
    }


}
