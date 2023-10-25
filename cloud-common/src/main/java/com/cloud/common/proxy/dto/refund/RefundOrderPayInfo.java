package com.cloud.common.proxy.dto.refund;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2021/11/26
 */
@Data
public class RefundOrderPayInfo implements Serializable {

    private static final long serialVersionUID = -1916031714438966703L;

    /**
     * 退票订单的退款记录Id
     */
    private String paymentId;

    /**
     * 退票订单号
     */
    private String orderNo;
}
