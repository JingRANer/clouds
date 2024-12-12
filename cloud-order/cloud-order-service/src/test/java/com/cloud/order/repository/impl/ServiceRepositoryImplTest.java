package com.cloud.order.repository.impl;

import com.cloud.order.BaseTest;
import com.cloud.order.repository.ServiceRepository;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ServiceRepositoryImplTest extends BaseTest {

    @Autowired
    ServiceRepository serviceRepository;

    @Test
    public void executeInsert() {

        String path = "/Users/jingran/Desktop/Data/passenger_2022/";
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
}