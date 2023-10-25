package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class RefundChangeRuleDetail implements Serializable {

    private static final long serialVersionUID = -7625222455287022096L;

    /**
     * 扣款率
     */
    private String rate;

    /**
     * 价格
     */
    private String price;

    /**
     * 时间范围
     */
    private String time;


}
