package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ReShoppingPrice implements Serializable {
    private static final long serialVersionUID = -5056343669593613795L;

    /**
     * 多航段运价信息
     */
    private List<SegmentFare> segmentFareList;

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
     * 当没有价格时，返回一个描述信息
     */
    private String priceDesc;

}
