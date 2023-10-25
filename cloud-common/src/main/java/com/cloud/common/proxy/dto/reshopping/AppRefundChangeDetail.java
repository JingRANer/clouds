package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @author chunhb
 * @date 2020/6/1 14:24
 */
@Data
public class AppRefundChangeDetail implements Serializable {
    /**
     * 时间范围的描述
     *
     * @mock 2020-02-26 12:30前
     */

    private String rcTimeDesc;

    /**
     * 退票改签费率都是  价格/人
     *
     * @mock 259
     */

    private String refundchangeRulePrice;

    /**
     * 是否有效(1：有
     *
     * @mock 1，proxy默认都是1
     */

    private int isUse;
    /**
     * 退票改签费率都是  百分比/人
     *
     * @mock 10%
     */

    private String refundchangeRuleRate;
}
