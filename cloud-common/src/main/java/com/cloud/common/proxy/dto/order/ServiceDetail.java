package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.util.List;

/**
 * @ClassName : ServiceDetail
 * @Description :
 * @Author : jzy
 * @Date: 2021-10-25 21:09
 */
@Data
public class ServiceDetail {
    /**
     * 票价
     */
    private Long price;

    /**
     * 手续费
     */
    private Long commission;

    /**
     * 总费用
     */
    private Long charge;

    /**
     * 燃油税
     */
    private Long fuelTax;

    /**
     * 机建费
     */
    private Long airportTax;

    /**
     * 儿童价
     */
    private Long childPrice;

    /**
     * 儿童机建税
     */
    private Long airportTaxCHD;

    /**
     * 儿童燃油税
     */
    private Long fuelTaxCHD;

    /**
     * 总费用
     */
    private Long chargeCHD;

    /**
     * 婴儿价
     */
    private Long infantPrice;

    /**
     * 婴儿机建税
     */
    private Long airportTaxINF;

    /**
     * 婴儿燃油税
     */
    private Long fuelTaxINF;

    /**
     * 总费用
     */
    private Long chargeINF;


    /**
     * 行李和值机描述
     */
    private String serviceRemark;

    private String passengerType;

    /**
     * 运价类别  OW：单程 RT：往返
     */
    private String priceType;

    /**
     * 航段信息
     */
    private List<SegmentDetail> segmentDetailList;

    /**
     * 透传字段
     */
    private String context;

    /**
     * 下单是否包含浮动产品
     */
    private boolean floatingProduct;

    /**
     * 浮动产品的原始价格
     */
    private String originalPrice;

    /**
     * 浮动产品的儿童原始价格
     */
    private String childOriginalPrice;

    /**
     * 浮动产品的婴儿原始价格
     */
    private String infantOriginalPrice;
}
