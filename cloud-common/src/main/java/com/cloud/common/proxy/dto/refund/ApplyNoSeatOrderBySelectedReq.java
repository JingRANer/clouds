package com.cloud.common.proxy.dto.refund;

import lombok.Data;

import java.util.List;

/**
 * @author zeyangw
 * @create 2022/09/22
 */
@Data
public class ApplyNoSeatOrderBySelectedReq {

    /**
     * 退票原因
     */
    private String orderNo;

    /**
     * 需要非自愿退乘客
     */
    List<NeedRefundPassengerInfo> passengerInfoList;

}
