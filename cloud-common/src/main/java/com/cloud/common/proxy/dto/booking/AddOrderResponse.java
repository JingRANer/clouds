package com.cloud.common.proxy.dto.booking;

import lombok.Data;

/**
 * @author lde
 * @create 2022/6/8
 */
@Data
public class AddOrderResponse {

    /**
     * 是否下单成功
     */
    private boolean success;

    /**
     * 错误信息
     */
    private String errMsg;

    /**
     * 附属商户代码
     */
    private String businessCode;

    /**
     * 附属商户名称
     * 保险的险种名或“行程单邮寄”
     */
    private String businessName;

    public AddOrderResponse() {
    }

    public AddOrderResponse(boolean success, String errMsg, String businessCode, String businessName) {
        this.success = success;
        this.errMsg = errMsg;
        this.businessCode = businessCode;
        this.businessName = businessName;
    }
}
