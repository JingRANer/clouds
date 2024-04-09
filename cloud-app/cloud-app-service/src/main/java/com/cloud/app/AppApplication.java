package com.cloud.app;

import com.cloud.order.rpc.client.OrderClient;
import com.cloud.order.rpc.config.DefaultFeignConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

/**
 * @author JingRAN
 */
@SpringBootApplication
@EnableFeignClients(clients = {OrderClient.class}, defaultConfiguration = DefaultFeignConfiguration.class)
public class AppApplication {
    public static void main(String[] args){
        SpringApplication.run(AppApplication.class);
    }



    /**
     * 创建RestTemplate并注入Spring容器
     */
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }
}