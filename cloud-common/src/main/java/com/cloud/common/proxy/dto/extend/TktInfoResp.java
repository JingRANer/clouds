package com.cloud.common.proxy.dto.extend;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/11/27
 */
@Data
public class TktInfoResp  extends BaseResponse {

    private static final long serialVersionUID = -6038713495561951535L;

    public TktInfoResp(){
        super();
    }

    public TktInfoResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }
    /**
     * 改期信息
     */
    List<OrderInfo> changeInfoList;

    /**
     * 退票信息
     */
    List<OrderInfo> refundInfoList;
}