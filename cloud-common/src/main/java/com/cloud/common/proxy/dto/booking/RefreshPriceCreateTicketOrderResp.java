package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2022/7/28
 */
@Data
public class RefreshPriceCreateTicketOrderResp implements Serializable {

    private static final long serialVersionUID = -599950038695137687L;

    /**
     * 下单成功后的订单号
     */
    private String orderNo;

    /**
     * 附属订单结果列表
     */
    private List<AddOrderResponse> addOrderList;

    /**
     * 主订单结果
     */
    private AddOrderResponse majorOrderInfo;

    /**
     * 下单倒计时
     */
    private String paymentTimeout;

}
