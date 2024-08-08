package com.cloud.shopping.dto;

import lombok.Data;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: RefundChangeRule
 * @create: 2024-08-08 13:35
 **/

@Data
public class RefundChangeInfo {

    private List<RefundChangeRuleDetail> refundRuleList;
    private List<RefundChangeRuleDetail> changeRuleList;
    private String ruleText;
}
