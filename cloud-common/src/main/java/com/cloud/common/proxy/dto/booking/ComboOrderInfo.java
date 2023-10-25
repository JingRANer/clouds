package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2022/6/8
 */
@Data
public class ComboOrderInfo {

    /**
     * 附属商户订单总价
     */
    private String amount;

    /**
     * 附属订单列表
     */
    private List<AddOrderInfo> addOrderList;


}
