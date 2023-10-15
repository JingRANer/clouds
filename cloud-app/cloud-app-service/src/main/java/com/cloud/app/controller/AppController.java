package com.cloud.app.controller;

import com.cloud.order.rpc.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cloud.order.rpc.pojo.User;

@RestController
@RequestMapping("/app")
public class AppController {


    @Autowired
    OrderClient orderClient;

    @GetMapping("/{orderId}")
    public User queryOrderByUserId(@PathVariable("orderId") Long orderId) {
        // 根据id查询订单并返回
        return orderClient.findById(orderId);
    }
}
