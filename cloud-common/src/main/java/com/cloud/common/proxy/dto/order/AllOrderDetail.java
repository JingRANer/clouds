package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.util.List;

/**
 * @author Administrator
 */
@Data
public class AllOrderDetail {
    /**
     * 机票单
     */
    private OrderDetailInfo oriOrder;
    /**
     * 改期单
     */
    private List<AllOrderDetail> changeOrder;
    /**
     * 退票单
     */
    private List<OrderDetailInfo> refundOrder;
    /**
     * 取消座位订单
     */
    private List<OrderDetailInfo> noSeatOrder;
}
