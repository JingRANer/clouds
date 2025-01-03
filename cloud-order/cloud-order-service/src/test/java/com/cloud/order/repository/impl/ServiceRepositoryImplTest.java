package com.cloud.order.repository.impl;

import com.cloud.order.BaseTest;
import com.cloud.order.repository.ServiceRepository;
import com.cloud.order.util.RedisService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.UUID;

public class ServiceRepositoryImplTest extends BaseTest {

    @Autowired
    ServiceRepository serviceRepository;

    @Autowired
    RedisService redisService;

    @Test
    public void executeInsert() {

        String path = "/Users/jingran/Desktop/Data/2022/passenger_2022/";
        serviceRepository.executeInsert(path, "passenger");
    }

    @Test
    public void test() throws IOException {
        String path = "/Users/jingran/Desktop/Data/service_2022/test.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true));

        bufferedWriter.write("hellohello!'\n'");
        bufferedWriter.flush();
        bufferedWriter.newLine();

        bufferedWriter = new BufferedWriter(new FileWriter(path, true));
        bufferedWriter.write("byebye!");
        bufferedWriter.flush();
        bufferedWriter.newLine();
    }

    @Test
    public void testRedis() {
        redisService.setKey("NAME_", UUID.randomUUID().toString());
        boolean name = redisService.isExist("NAME_");
        Object name1 = redisService.getKey("NAME_");
        String test = (String)name1;
        boolean name2 = redisService.delete("NAME_");
        boolean name3 = redisService.isExist("NAME_");
    }
}