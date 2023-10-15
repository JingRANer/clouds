package com.cloud.order.rpc.config;

import feign.Logger;
import org.springframework.context.annotation.Bean;

/**
 * @author JingRAN
 */
public class DefaultFeignConfiguration {
    @Bean
    public Logger.Level logLevel(){
        return Logger.Level.BASIC;
    }
}
