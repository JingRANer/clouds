package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2022/4/7
 */
@Data
public class OrderRequestInfo {

    private List<OrderRequestNew> orderRequestList;

    public OrderRequestInfo(List<OrderRequestNew> orderRequestList) {
        this.orderRequestList = orderRequestList;
    }

    public OrderRequestInfo() {
    }
}
