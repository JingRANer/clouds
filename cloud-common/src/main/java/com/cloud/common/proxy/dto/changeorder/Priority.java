package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class Priority implements Serializable {
    private static final long serialVersionUID = 3953953509149393383L;

    /**
     * 权益类型
     * BAGGAGE_ALLOWANCE
     * CARRY_ON_BAGGAGE_ALLOWANCE
     * MEAL_SERVICE
     * GROUND_SERVICE
     * CABIN_SERVICE
     * ADDED_SERVICE
     */
    private String type;

    /**
     * 权益描述
     */
    private List<String> descList;

    /**
     * 权益信息名称
     */
    private String info;

    /**
     * 透传字段，例如行李权益会有行李的具体限制信息（参考BaggagePriority中的定义）
     */
    private String context;
}
