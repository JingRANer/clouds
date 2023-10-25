package com.cloud.common.proxy.dto.changeorder.rulepriority;

import lombok.Data;

import java.io.Serializable;

/**
 * 退改签规则详情
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/6 11:11
 */
@Data
public class RefundChangeRuleDetail implements Serializable {

    private static final long serialVersionUID = 1372368397922946393L;
    /**
     * 是否有效
     */
    private int isUse;
    /**
     * 扣款率
     */
    private String refundchangeRuleRate;
    /**
     * 价格
     */
    private String refundchangeRulePrice;
    /**
     * 时间范围
     */
    private String rcTimeDesc;

}
