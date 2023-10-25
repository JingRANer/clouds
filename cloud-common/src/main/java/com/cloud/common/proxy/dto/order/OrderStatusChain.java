package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class OrderStatusChain implements Serializable{

    private static final long serialVersionUID = -6155310212413108584L;
    /**
     * 订单号
     */
    private String orderId;

    /**
     * 航司名称
     */
    private String airlineName;

    /**
     * 状态链列表
     */
    private List<StatusChain> statusChainList;
}
