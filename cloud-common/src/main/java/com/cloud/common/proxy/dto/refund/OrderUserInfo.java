package com.cloud.common.proxy.dto.refund;

import lombok.Data;

@Data
public class OrderUserInfo {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户id
     */
    private String userId;
}
