package com.cloud.order.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: RedisService
 * @create: 2024-12-15 15:49
 **/

@Component
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;


    public void setKey(String key, Object value) {
        try {
            redisTemplate.opsForValue().setIfAbsent(key, value, 4, TimeUnit.HOURS);
        } catch (Exception e) {
            System.err.println(key + ":" + value);
        }
    }

    public Object getKey(String key) {
        return redisTemplate.opsForValue().get(key);
    }

    public boolean isExist(String key) {
        return redisTemplate.hasKey(key);
    }
    public boolean delete(String key) {
        return redisTemplate.delete(key);
    }
}
