package com.cloud.shopping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName : ShoppingApplication
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-24 18:44
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class ShoppingApplication {
    public static void main(String[] args) {
        SpringApplication.run(ShoppingApplication.class);
    }

}
