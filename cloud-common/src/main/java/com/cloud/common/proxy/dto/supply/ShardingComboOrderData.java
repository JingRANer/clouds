package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingComboOrderData.java
 * @Description TODO
 * @createTime 2022年10月26日 16:47:00
 */
@Data
public class ShardingComboOrderData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long id;

    /**
     * 组合订单ID
     */
    private String comboId;

    /**
     * 航旅订单号。与umetrip_air_order表中order_no关联
     */
    private String orderNo;

    /**
     * 主支付订单号
     */
    private String paymentId;

    /**
     * 订单总价
     */
    private BigDecimal totalAmount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
    /**
     * 操作人用户ID
     */
    private String userId;
    /**
     * 是否更新操作
     */
    private boolean update;
}
