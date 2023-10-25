package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingSuperOrderData.java
 * @Description TODO
 * @createTime 2022年10月26日 16:48:00
 */
@Data
public class ShardingSuperOrderData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long id;

    /**
     * 创建订单时产生 不更新
     */
    private String superOrderNo;

    /**
     * 航司大订单号,在不分解子订单号的渠道，预订时的
     * AIRLINEORDERNO=AIRLINESUBORDERNO
     */
    private String airlineOrderNo;

    /**
     * 航旅大订单状态
     */
    private String superStatus;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 操作人航旅用户id
     */
    private String userId;

    /**
     * 客户端版本号
     */
    private String appVersion;
    /**
     * 是否更新操作
     */
    private boolean update;
}
