package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

/**
 * @author zcy
 * @Date 2022-01-06
 */
@Data
public class ChangeMoneyDetail {

    /**
     * 儿童改期费用
     */
    private String childCharge;

    /**
     * 儿童改期手续费
     */
    private String childCommission;

    /**
     * 儿童改期差价
     */
    private String childDifferentPrice;

    /**
     * 成人改期费用
     */
    private String adultCharge;

    /**
     * 成人改期手续费
     */
    private String adultCommission;

    /**
     * 成人改期价格
     */
    private String adultDifferentPrice;
}
