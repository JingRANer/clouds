package com.cloud.common.proxy.dto.refund;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

/**
 * @author lde
 * @create 2021/11/2
 */
@Data
public class UpdateRefundTicketOrderStatusResp  extends BaseResponse {


    public UpdateRefundTicketOrderStatusResp() {
    }

    public UpdateRefundTicketOrderStatusResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }


    /**
     * 退票订单状态
     */
    private String refundOrderStatus;

    /**
     * 是否需要退款
     */
    private boolean needRefund;

}
