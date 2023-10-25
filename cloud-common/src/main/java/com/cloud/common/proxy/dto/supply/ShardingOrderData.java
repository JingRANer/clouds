package com.cloud.common.proxy.dto.supply;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author liwenjie
 * @ClassName ShardingOrderData.java
 * @Description TODO
 * @createTime 2022年10月26日 13:09:00
 */
@Data
public class ShardingOrderData implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 自增id
     */
    private Long id;

    /**
     * 航旅子订单号
     */
    private String orderNo;

    /**
     * 航司子订单号
     */
    private String airlineSubOrderNo;

    /**
     * 操作人用户ID
     */
    private String userId;

    /**
     * 航司二字码
     */
    private String airline;

    /**
     * 订单状态
     */
    private String status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;

    /**
     * 审核时间
     */
    private Date auditTime;

    /**
     * 订单支付截止时间
     */
    private Date expiredTime;

    /**
     * 调用渠道接口成功时间
     */
    private Date doneTime;

    /**
     * 重试次数
     */
    private Integer retryCount;

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系电话
     */
    private String contactPhone;

    /**
     * 错误码
     */
    private Integer errCode;

    /**
     * 错误原因
     */
    private String errMsg;

    /**
     * 取消订单时间
     */
    private Date cancelTime;

    /**
     * 取消原因，用户主动取消选择的原因。 或者未支付自动取消原因为：“超时自动取消”
     */
    private String cancelReason;

    /**
     * 订单总票价
     */
    private Long totalPrice;

    /**
     * 订单总税额
     */
    private Long totalTax;

    /**
     * 用户提交金额，用于退票场景，记录用户当时申请金额。
     */
    private Long applyTotalPrice;

    /**
     * 与订单类型有关
     */
    private Long totalCommission;

    /**
     * 订单总交易金额
     */
    private Long totalCharge;

    /**
     * 订单类型。
     */
    private String orderType;

    /**
     * 销售渠道 CZ，ASMS等
     */
    private String source;

    /**
     * 退票类型  0：自愿 1：非自愿
     */
    private Integer irrType;

    /**
     * 退票原因
     */
    private String irrReason;

    /**
     * 退票材料存储文件key
     */
    private String irrFileKeys;

    /**
     * 原始订单号。当当前订单是CHANGE或REFUND时，需要关联原订单号。
     */
    private String oriOrderNo;

    /**
     * 航旅大订单号
     */
    private String superOrderNo;

    /**
     * 支付渠道
     */
    private Integer payChannel;

    /**
     * 预订记录编号（针对美程拼单情况记录pnr）
     */
    private String pnr;

    /**
     * 0：不支持二次申退接口
     1：可以提交二次申退
     */
    private Integer secondRefund;

    /**
     * 原订单号。当当前订单是CHANGE或REFUND时，需要关联原订单号。
     */
    private String oriStatus;

    /**
     * 是否支持再次提交0 不可在此单提交再次退票;1 可以再此单提交再次退票
     */
    private Integer supportResubmit;

    /**
     * 是否为合并支付订单
     */
    private Integer combo;

    /**
     * 是否更新操作
     */
    private boolean update;


    /**
     * 用于区分app，微信小程序等来源，默认是app
     * 值为“app”或“wx”
     */
    private String sourceFrom;

    /**
     * 订单的前项来源
     */
    private String orderSource;


}
