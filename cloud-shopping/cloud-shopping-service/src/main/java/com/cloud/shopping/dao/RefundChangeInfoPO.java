package com.cloud.shopping.dao;

import lombok.Data;

import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: RefundChangeRule
 * @create: 2024-08-08 13:35
 **/

@Data
public class RefundChangeInfoPO {

    private List<RefundChangeRuleDetailPO> refundList;
    private List<RefundChangeRuleDetailPO> changeList;
    private String ruleText;
}
