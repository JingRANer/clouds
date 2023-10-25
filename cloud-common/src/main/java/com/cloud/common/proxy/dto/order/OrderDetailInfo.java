package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.booking.TicketOrderInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 订单详情
 *
 * @author Administrator
 */
@Data
public class OrderDetailInfo implements Serializable {

    /**
     * 订单信息
     */
    private TicketOrderInfo ticketOrderInfo;
    /**
     * 航段信息（用于判断单程往返）
     */
    private List<SegmentInfo> segmentInfo;
    /**
     * 服务信息
     */
    private List<ServiceInfo> serviceInfo;
    /**
     * 状态链
     */
    private OrderStatusChain orderStatusChain;
    /**
     * 其他补充信息，json存储
     */
    private String otherInfo;
    /**
     * 退改签规则
     */
    private String refundChangeRuler;
    /**
     * 权益信息
     */
    private String equityInfo;
    /**
     * 支付信息
     */
    PaymentInfo payInfo;
    /**
     * 行李额信息
     */
    private String baggageDetailInfo;
    /**
     * 中转服务信息
     */
    private String transferServiceInfo;
    /**
     * 改期前的中转服务信息
     */
    private String transferServiceInfoBeforeChange;
    /**
     * 审核失败描述
     */
    private String refundComment;

    /**
     * 组合支付订单标识
     * 0：不是组合支付订单
     * 1：是组合支付订单
     */
    private Integer combo;

    /**
     * 组合订单
     */
    private ComboOrderDetailInfo comboOrderDetailInfo;

    private String refundChangeRulerCHD;

    private String baggageDetailInfoCHD;

    private String refundChangeRulerINF;

    private String baggageDetailInfoINF;

    /**
     * 退款信息
     */
    private RefundInfo refundInfo;

}
