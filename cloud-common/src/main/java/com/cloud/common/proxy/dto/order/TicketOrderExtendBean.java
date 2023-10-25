package com.cloud.common.proxy.dto.order;

import com.umetrip.air.order.service.dto.booking.OrderRequestNew;
import lombok.Data;

import java.io.Serializable;

/**
 * 订单扩展信息Bean
 * @author umetrip
 */
@Data
public class TicketOrderExtendBean implements Serializable {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 退改签规则
     */
    private String refundChangeRuler;

    /**
     * 产品说明
     */
    private String equityInfo;


    private String otherInfo;

    /**
     * 行李信息
     */
    private String baggageDetailInfo;

    /**
     * 中转服务
     */
    private String transferServiceInfo;

    /**
     * 退改签规则类型
     * 0：每条航段都有自己的退改规则（1对1）
     * 1：多条航段有同一条退改规则（1对n）
     */
    private int refundChangeRuleType;

    private String baggageDetailInfoCHD;

    private String refundChangeRulerCHD;

    private String baggageDetailInfoINF;

    private String refundChangeRulerINF;


    public TicketOrderExtendBean(){

    }

    public TicketOrderExtendBean(String orderNo, String priorityInfo, OrderRequestNew orderRequestNew){
        this.orderNo = orderNo;
        this.refundChangeRuler = orderRequestNew.getRefundChangeRuler();
        this.otherInfo = orderRequestNew.getOtherInfo();
        this.equityInfo = priorityInfo;
        this.baggageDetailInfo = orderRequestNew.getBaggageDetailInfo();
        this.transferServiceInfo = orderRequestNew.getTransferServiceInfo();
        this.refundChangeRuleType = orderRequestNew.getRefundChangeRuleType();
        this.baggageDetailInfoCHD = orderRequestNew.getBaggageDetailInfoCHD();
        this.refundChangeRulerCHD = orderRequestNew.getRefundChangeRulerCHD();
        this.baggageDetailInfoINF = orderRequestNew.getBaggageDetailInfoINF();
        this.refundChangeRulerINF = orderRequestNew.getRefundChangeRulerINF();
    }

}
