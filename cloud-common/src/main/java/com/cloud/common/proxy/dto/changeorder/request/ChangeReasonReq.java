package com.cloud.common.proxy.dto.changeorder.request;

import lombok.Data;

import java.util.List;

/**
 * 改期原因请求参数
 *
 * @className ChangeReasonReq
 * @description: 改期原因请求参数
 * @author yangsl
 * @date 2022/4/1 13:24
 */
@Data
public class ChangeReasonReq {
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 航司
     */
    private String airline;
    /**
     * 渠道
     */
    private String source;
    /**
     * 用户已选航段ID集合
     */
    private List<String> segmentIdList;
    /**
     * sessionId
     */
    private String sessionId;
}
