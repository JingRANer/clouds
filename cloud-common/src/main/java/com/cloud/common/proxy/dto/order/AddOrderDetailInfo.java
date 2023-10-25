package com.cloud.common.proxy.dto.order;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;

/**
 * @ClassName : AddOrderDetailInfo
 * @Description :
 * @Author : jzy
 * @Date: 2022-06-09 14:33
 */
@Data
public class AddOrderDetailInfo {

    /**
     * 自增id
     */
    private Long id;

    /**
     * 组合订单ID
     */
    private String comboId;

    /**
     * 业务编码
     */
    private String businessCode;

    /**
     * 附属订单号
     */
    private String addOrderNo;

    /**
     * 附属订单支付单号
     */
    private String addPaymentId;

    /**
     * 子订单下单接口数据
     */
    private String createContent;

    /**
     * 子订单外部显示数据
     */
    private String showContent;

    /**
     * 跳转参数
     */
    private String jumpParameter;

    /**
     * 附属订单状态
     */
    private String addStatus;

    /**
     * 附属订单金额
     */
    private BigDecimal amount;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;
}
