package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.Parameter;
import lombok.Data;

import java.io.Serializable;

/**
 * @author lyxbai
 */
@Data
public class TicketOrderListInfo implements Serializable {

    private static final long serialVersionUID = -7742588634106744779L;

    /**
     * 订单状态
     * @mock 待支付
     */
    private String orderStatus;

    /**
     * 订单颜色
     * @mock #53AB3A
     */
    private String orderColor;

    /**
     * 订单金额
     * @mock ￥4300
     */
    private String orderPrice;

    /**
     * 订单号
     * @mock 20200508151339904792
     */
    private String orderId;

    /**
     * 去程航段信息
     */
    private SegmentFlightInfo deptSegmentFlightInfo;

    /**
     * 返程航段信息
     */
    private SegmentFlightInfo destSegmentFlightInfo;

    /**
     * 跳转Weex参数targetPageId
     */
    private String targetPageId;

    /**
     * 跳转Weex参数parameter
     */
    private Parameter parameter;
}

