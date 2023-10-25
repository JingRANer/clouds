package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryMajorOrderRequest implements Serializable {

    private static final long serialVersionUID = 1839224500291854598L;

    /**
     * 主商户订单号
     */
    private String orderNo;
}
