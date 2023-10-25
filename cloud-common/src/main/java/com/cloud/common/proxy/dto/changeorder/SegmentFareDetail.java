package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class SegmentFareDetail implements Serializable {
    private static final long serialVersionUID = 1702087418084022734L;

    /**
     * journeySegment中的index关联
     */
    private String journeySegmentIndex;

    /**
     * 舱等
     */
    private String cabin;

    /**
     * 舱位等级中文描述
     */
    private String cabinName;

    /**
     * 舱位代码
     */
    private String classCode;

    /**
     * 舱位描述
     */
    private String classDesc;

    /**
     * 舱位等级标准价
     */
    private String classBasicPrice;

    /**
     * 舱位折扣
     */
    private String classDiscount;

    /**
     * 成人价格详情
     */
    private OfferPrice adultPrice;

    /**
     * 儿童价格详情
     */
    private OfferPrice childPrice;

    /**
     * 婴儿价格详情
     */
    private OfferPrice infantPrice;

    /**
     * 退改规则
     */
    private RefundChangeRule refundChangeRule;

    /**
     * 运价产品
     */
    private FareProduct fareProduct;

    /**
     * 权益信息
     */
    private List<Priority> priorityList;

    /**
     * 透传字段
     */
    private String context;

    /**
     * 产品舱代码
     */
    private String productCode;

    /**
     * 是否浮动产品
     */
    private boolean isFloatingProduct;
}
