package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class Offer implements Serializable {
    private static final long serialVersionUID = 4462827511707048969L;

    /**
     * 多航段运价信息
     */
    private List<SegmentFareDetail> segmentFareDetail;

    /**
     * 成人价
     */
    private OfferPrice adultPrice;

    /**
     * 儿童价
     */
    private OfferPrice childPrice;


    /**
     * 婴儿价
     */
    private OfferPrice infantPrice;

    /**
     * 可用座位个数
     */
    private String avCount;

    /**
     * 权益信息
     */
    private List<Priority> priority;

    /**
     * 退改规则
     * 一般退改规则都存在航段offer的SegmentFare上，如果一个offer的多个航段有统一的运价规则的时候就放在offer上。
     */
    private RefundChangeRule refundChangeRule;

}
