package com.cloud.order.controller;

import com.cloud.order.domain.RanAirOrder;
import com.cloud.order.service.iface.TicketOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.cloud.order.rpc.pojo.User;

@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private TicketOrderService ticketOrderService;

    @GetMapping("/{id}")
    public User queryOrderByUserId(@PathVariable("id") Long id,
                                   @RequestHeader(value = "Truth", required = false) String truth) {
        RanAirOrder ranAirOrder = ticketOrderService.getRanAirOrder(id);
        User user = new User();
        user.setId(ranAirOrder.getOrderNo());
        user.setMobile(ranAirOrder.getContactPhone());
        System.out.println("id:" + id + ", header："+truth);
        return user;
    }
}
