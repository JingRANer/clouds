package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @ClassName : ComboOrderDetailInfo
 * @Description : 组合订单
 * @Author : jzy
 * @Date: 2022-06-09 14:28
 */
@Data
public class ComboOrderDetailInfo {

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
     * 附属商户关联订单列表
     */
    private List<AddOrderDetailInfo> addOrderList;
}
