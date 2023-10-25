package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class SegmentFare implements Serializable {
    private static final long serialVersionUID = 1702087418084022734L;

    /**
     * journeySegment中的index关联
     */
    private String journeySegmentIndex;

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
     * 权益信息
     */
    private Priority priority;

    /**
     * 产品舱代码
     */
    private String productCode;

    /**
     * 是否浮动产品
     */
    private boolean isFloatingProduct;
}


