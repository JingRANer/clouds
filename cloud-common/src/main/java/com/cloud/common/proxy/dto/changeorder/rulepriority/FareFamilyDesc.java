package com.cloud.common.proxy.dto.changeorder.rulepriority;

import lombok.Data;

import java.io.Serializable;

/**
 * 票价产品描述-退改签规则和行李规定
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/6 13:08
 */
@Data
public class FareFamilyDesc implements Serializable {
    private static final long serialVersionUID = -2175018223678613436L;
    /**
     * 订单渠道
     */
    private String source;
    /**
     * 航司二字码
     */
    private String airline;
    /**
     * 航班号
     */
    private String flightno;
    /**
     * 舱位等级
     */
    private String cabin;
    /**
     * 舱位
     */
    private String classCode;
    /**
     * 舱位产品
     */
    private String cabinProduct;
    /**
     * 航班日期
     */
    private String flightDate;
    /**
     * 出发地三字码
     */
    private String deptCode;
    /**
     * 目的地三字码
     */
    private String destCode;
    /**
     * 飞行方向，标识去程和返程用，原样返回
     * G去程，  B返程
     */
    private String flightDirection;
    /**
     * 北京-上海 航班号
     */
    private String flightDesc;
    /**
     * 退改签规则
     */
    private RefundChangeRule refundChangeRule;
    /**
     * 行李规定
     */
    private BaggageDetail baggageDetail;

    /**
     * 退改签规则
     */
    private RefundChangeRule refundChangeRuleCHD;
    /**
     * 行李规定
     */
    private BaggageDetail baggageDetailCHD;

    /**
     * 退改签规则
     */
    private RefundChangeRule refundChangeRuleINF;
    /**
     * 行李规定
     */
    private BaggageDetail baggageDetailINF;
}
