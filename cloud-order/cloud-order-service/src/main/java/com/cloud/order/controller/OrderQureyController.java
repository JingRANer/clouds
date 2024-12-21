package com.cloud.order.controller;

import com.cloud.order.rpc.neo4j.pojo.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: OrderQureyController
 * @create: 2024-12-16 10:31
 **/

@RestController
@RequestMapping("/orderquery")
public class OrderQureyController {

    @GetMapping("/{orderNo}")
    public Order queryOrderByUserId(@PathVariable("orderNo") String orderNo) {
        System.out.println(orderNo);
        return new Order();
    }
}
