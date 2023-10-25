package com.cloud.common.proxy.dto.pay;

import lombok.Data;

/**
 * @author lde
 * @create 2023/9/25
 */
@Data
public class DealOrderByCallBackReq {


    private String orderNo;

    private String callBackSettleOrderInfoJson;


}
