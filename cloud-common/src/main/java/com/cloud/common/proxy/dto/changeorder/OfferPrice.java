package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class OfferPrice implements Serializable {
    private static final long serialVersionUID = -4709455402390688942L;

    /**
     * 收费金额
     */
    private String charge;

    /**
     * 机票价格，折扣后的费用，
     * 正常情况下，price = basePrice
     * 在机票价格有折扣或者减免的情况下，price < basePrice
     *
     */
    private String price;

    /**
     * 基础价格,未折扣的费用
     */
    private String basePrice;

    /**
     * 手续费，改期手续费
     */
    private String commission;

    /**
     * 差价，改期舱位差价
     */
    private String differTktPrice;

    /**
     * 税费差价
     * 对于改期来说，目前应该不会出现，国际航班会有
     */
    private String differTaxes;

    /**
     * 币种
     */
    private String currency;

    /**
     * 税费信息
     */
    private Taxes taxes;
}
