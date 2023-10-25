package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author lyxbai
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class GetOrderListInfoResp extends BaseResponse {

    private static final long serialVersionUID = 7348307266718696755L;

    public GetOrderListInfoResp(){
        super();
    }

    public GetOrderListInfoResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    /**
     * 订单列表信息
     */
    private List<OrderStatusAndSeg> orderStatusAndSegList;
}
