package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class RefundChangeRule implements Serializable {

    private static final long serialVersionUID = 5028448131480152721L;

    /**
     * 退票规则
     */
    private List<RefundChangeRuleDetail> refundRuleList;

    /**
     * 改期规则
     */
    private List<RefundChangeRuleDetail> changeRuleList;

    /**
     * 退改规则原文
     */
    private String ruleText;
}
