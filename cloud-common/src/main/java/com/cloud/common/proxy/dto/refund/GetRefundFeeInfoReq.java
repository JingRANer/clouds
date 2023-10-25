package com.cloud.common.proxy.dto.refund;


import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/10/25
 */
@Data
public class GetRefundFeeInfoReq {

    /**
     * 订单号
     */
    private String orderNo;

    /**
     * 用户已选乘机人
     */
    private List<NeedRefundPassengerInfo> passengerInfoList;

    /**
     * 二次退票，原refundOrder订单号
     */
    private String refundOrderNo;

}
