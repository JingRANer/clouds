package com.cloud.order.rpc.client;

import com.cloud.order.rpc.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "cloud-order-service")
public interface OrderClient {

    @GetMapping("/order/{id}")
    User findById(@PathVariable("id") Long id);
}
