package com.cloud.common.util;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
}
