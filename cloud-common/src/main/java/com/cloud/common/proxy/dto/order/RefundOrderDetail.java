package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.booking.TicketPassengerInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class RefundOrderDetail implements Serializable {

    /**
     * 旅客集合
     */
    private List<TicketPassengerInfo> passengers;

    /**
     * 航段集合
     */
    private OrderSegment orderSegment;


    /**
     * 支付记录
     */
    private List<PaymentInfo> paymentInfo;


    /**
     * 状态链
     */
    private OrderStatusChain orderStatusChain;

    /**
     * 退票单号
     */
    private String refundNo;

    /**
     * 证明材料
     */
    private List<String> evidence;

}
