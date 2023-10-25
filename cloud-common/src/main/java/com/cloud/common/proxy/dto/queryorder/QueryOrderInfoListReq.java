package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

import java.io.Serializable;

@Data
public class QueryOrderInfoListReq  implements Serializable {

    private static final long serialVersionUID = 4958692398730001002L;

    /**
     * id
     */
    private String userId;
    /**
     * 需筛选的兑换码
     */
    private String exchangeCode;
    /**
     * 分页页数
     */
    private int pageNum;
    /**
     * 分页展示数量
     */
    private int pageCount;
    /**
     * 状态类型分类展示
     */
    private String statusType;
}
