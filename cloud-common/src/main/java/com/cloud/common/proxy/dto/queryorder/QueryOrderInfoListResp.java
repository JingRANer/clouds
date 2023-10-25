package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class QueryOrderInfoListResp implements Serializable {

    private static final long serialVersionUID = 4958692398730001002L;

    /**
     * 订单展示信息
     */
    private List<TicketOrderInfo> orderInfo;

    /**
     * 订单总数
     */
    private int orderTotalCount;

}
