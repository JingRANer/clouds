package com.cloud.common.proxy.dto.refundInvoice;


import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * @ClassName : QueryRefundPassengerResp
 * @Description :
 * @Author : jzy
 * @Date: 2021-09-01 13:46
 */
@Data
public class QueryRefundPassengerResp extends BaseResponse {

    private List<RefundPassengerInfo> passengerInfoList;
}
