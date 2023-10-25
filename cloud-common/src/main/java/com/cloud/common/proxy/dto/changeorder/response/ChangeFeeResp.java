package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.ReShoppingPrice;
import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 9/20/22
 */
@Data
public class ChangeFeeResp implements Serializable {
    private static final long serialVersionUID = 2358048165483018019L;

    /**
     * 航班最低价或是选择的某个舱位的价格（中转的话，可能是两个舱位）
     */
    private ReShoppingPrice reShoppingPrice;

    /**
     * session
     */
    private String sessionId;


}
