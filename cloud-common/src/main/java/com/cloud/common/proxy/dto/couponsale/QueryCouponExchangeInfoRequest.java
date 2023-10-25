package com.cloud.common.proxy.dto.couponsale;

import lombok.Data;

import java.io.Serializable;

/**
 * @author lde
 * @create 2022/6/27
 */
@Data
public class QueryCouponExchangeInfoRequest implements Serializable {

    private static final long serialVersionUID = 3101649581862355203L;
    /**
     * 兑换码
     */
    private String exchangeCode;

    /**
     * 优惠券码
     */
    private String couponCode;
}
