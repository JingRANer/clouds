package com.cloud.common.proxy.dto.refund;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

/**
 * @author lde
 * @create 2021/11/5
 */
@Data
public class UpdateRefundStatusResp extends BaseResponse {


    /**
     * 支付状态
     */
    private String payStatus;

    public UpdateRefundStatusResp() {
    }

    public UpdateRefundStatusResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
