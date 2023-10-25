package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @author jingran
 */
@Data
public class RefundChangeDetail implements Serializable {
    /**
     * 时间范围的描述
     *
     * @mock 2020-02-26 12:30 前
     */

    private String rcTimeDesc;

    /**
     * 退票改签费率都是  价格/人
     *
     * @mock 259
     */

    private String refundchangeRulePrice;

    /**
     * 是否有效(1：有效；0：无效)
     *
     * @mock 1
     */

    private int isUse;

    /**
     * 退票改签费率
     * 搜索带过来的不带百分号%
     * @mock 50%
     */

    private String refundchangeRuleRate;
}
