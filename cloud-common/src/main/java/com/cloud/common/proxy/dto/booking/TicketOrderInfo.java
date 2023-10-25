package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.order.ServiceInfo;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Set;

/**
 * @author lyxbai
 */
@Builder
@Data
public class TicketOrderInfo implements Serializable{

    private static final long serialVersionUID = 1L;

    private BigDecimal id;

    private String orderno;

    private String airlineorderno;

    private BigDecimal userid;

    private String airline;

    private String flightno;

    private String hostflight;

    /**
     * 0 已创建
     * 1 创建失败
     * 2 创建成功
     * 3 已过期
     * 4 已支付
     * 5 支付失败
     * 6 已取消
     * 7 取消失败
     * 8 已出票
     * 9 出票失败
     * 10 已删除
     * 11 有退改
     */
    private String status;

    private Date createtime;

    private Date canceltime;

    private Date updatetime;

    private Date paytime;

    private Date tickettime;

    private String pnr;

    private BigDecimal totalprice;

    private BigDecimal totaltax;

    /**
     *  联系人
     */
    private String linkman;

    /**
     * 电话
     */
    private String phone;

    /**
     * 兑换码
     */
    private String redemptioncode;

    /**
     * 兑换码名称
     */
    private String redemptionname;

    /**
     * 常客id
     */
    private String memberid;

    /**
     * 客户端版本号
     */
    private String appversion;

    /**
     * 创建失败错误码
     */
    private String errorcode;

    /**
     * 创建失败原因
     */
    private String errormsg;

    /**
     * 权益信息
     */
    private String equityinfo;

    /**
     * 退改签规则
     */
    private String refundchangeruler;


    private String airlinesuborderno;

    private String cancelreason;

    /**
     * 其他补充信息，json存储
     */
    private String otherInfo;

    /**
     * 是否组合下单
     */
    private String isUnion;

    /**
     * 组合下单往返方向
     */
    private String unionDirection;

    private Set<String> airlineOrderItemNos;

    /**
     * 渠道
     * 航司渠道用航司二字码代替，美程渠道用asms
     */
    private String source;

    /**
     * --------------------------------  订单改版  -----------------------------------
     */

    private String orderType;

    private String oriOrderNo;

    /**
     * 0,1,2
     */
    private String transfer;

    /**
     * 大订单展示状态
     */
    private String superStatus;

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
     * 航旅大订单号
     */
    private String superOrderNo;
    /**
     * 支付渠道
     */
    private Integer payChannel;
    /**
     * 0：不支持二次申退接口
     * 1：可以提交二次申退
     */
    private Integer secondRefund;
    /**
     * 原订单状态
     */
    private String oriStatus;
    /**
     * 服务信息
     */
    private List<ServiceInfo> serviceInfo;
    /**
     * 是否支持再次提交0 不可在此单提交再次退票;1 可以再此单提交再次退票
     */
    private Integer supportResubmit;

    /**
     * 订单来源
     */
    private String orderSource;
    /**
     * 预留字段，存临近航班支付时间
     */
    private String extraField1;




}