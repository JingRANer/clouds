package com.cloud.order.rpc.client;

import com.cloud.order.rpc.neo4j.pojo.Order;
import com.cloud.order.rpc.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Component
@FeignClient(value = "cloud-order-service")
public interface OrderClient {

    @GetMapping("/order/{id}")
    User findById(@PathVariable("id") Long id);
    @GetMapping("/orderquery/{orderNo}")
    Order queryOrder(@PathVariable("orderNo") String orderNo);
}
