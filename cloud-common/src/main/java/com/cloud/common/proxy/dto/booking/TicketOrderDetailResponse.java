package com.cloud.common.proxy.dto.booking;


import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

@Data
public class TicketOrderDetailResponse extends BaseResponse {


    private static final long serialVersionUID = 4552819578087171910L;

    public TicketOrderDetailResponse(){
        super();
    }

    public TicketOrderDetailResponse(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    /**
     * 订单信息
     */
    TicketOrderDetail ticketOrderInfo;


}
