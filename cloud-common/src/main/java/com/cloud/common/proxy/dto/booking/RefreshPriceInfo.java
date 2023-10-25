package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author lde
 * @create 2022/7/27
 */
@Data
public class RefreshPriceInfo {

    /**
     * 往返
     */
    private String roundTrip;

    /**
     * 价格
     */
    private BigDecimal price;

    /**
     * 机场税
     */
    private BigDecimal airportTax;

    /**
     * 燃油税
     */
    private BigDecimal fuelTax;

    /**
     * 总金额
     */
    private BigDecimal totalPrice;

    /**
     * 儿童价格
     */
    private BigDecimal childPrice;

    /**
     * 儿童机场税
     */
    private BigDecimal childAirportTax;

    /**
     * 儿童燃油税
     */
    private BigDecimal childFuelTax;

    /**
     * 儿童总金额
     */
    private BigDecimal childTotalPrice;

    /**
     * 浮动产品的原始价格
     */
    private BigDecimal originalPrice;

    /**
     * 浮动产品的原始价格 儿童价
     */
    private BigDecimal childOriginalPrice;
}
