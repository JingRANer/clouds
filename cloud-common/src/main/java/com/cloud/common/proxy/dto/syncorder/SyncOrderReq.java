package com.cloud.common.proxy.dto.syncorder;

import lombok.Data;
import org.apache.commons.lang.StringUtils;

@Data
public class SyncOrderReq {
    /**
     * 订单号
     */
    String orderNo;

    public boolean checkReq() {
        return StringUtils.isNotBlank(this.orderNo);
    }
}
