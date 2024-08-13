package com.cloud.shopping.dao;

import lombok.Data;

import java.math.BigDecimal;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: RefundChangeRuleDetail
 * @create: 2024-08-08 13:35
 **/

@Data
public class RefundChangeRuleDetailPO {
    private BigDecimal refundchangeRuleRate;
    private BigDecimal refundchangeRulePrice;
    private String rcTimeDesc;
}
