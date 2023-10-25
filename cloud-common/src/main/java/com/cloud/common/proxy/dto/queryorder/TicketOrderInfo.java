package com.cloud.common.proxy.dto.queryorder;

import com.umetrip.air.order.service.dto.booking.SegmentFlightInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class TicketOrderInfo implements Serializable {

    private static final long serialVersionUID = 4958692398730001002L;

    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 订单状态描述
     */
    private String orderStatus;
    /**
     * 订单状态字体颜色
     */
    private String orderColor;
    /**
     * 订单金额
     */
    private String orderCharge;
    /**
     * 去程航段基本信息
     */
    private List<SegmentFlightInfo> deptSegmentFlightInfo;
    /**
     * 返程航段基本信息
     */
    private List<SegmentFlightInfo> destSegmentFlightInfo;
}
