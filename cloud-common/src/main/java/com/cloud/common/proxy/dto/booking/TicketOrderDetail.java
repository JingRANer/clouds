package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.order.*;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Data
public class TicketOrderDetail implements Serializable{
    public TicketOrderDetail(){
        nextChangeOrders = new ArrayList<TicketOrderDetail>();
    }

    //添加改期订单
    public void addChangeOrder(TicketOrderDetail ticketOrderInfo){
        nextChangeOrders.add(ticketOrderInfo);
    }

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

    private String orderStatus;

    private String statusDesc;

    private String statusColor;

    private String statusDetailDesc;

    private String statusChainDesc;

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
    private String contactsName;

    /**
     * 电话
     */
    private String contactsPhone;

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

    /**
     * 渠道
     * 航司渠道用航司二字码代替，美程渠道用asms
     */
    private String source;

    private String orderType;

    private String oriOrderNo;

    /**
     * 0,1,2
     */
    private String transfer;


    /**
     * 改期订单集合
     */
    private List<TicketOrderDetail> nextChangeOrders;

    /**
     * 退票订单
     */
    private List<RefundOrderDetail> refundOrders;

    /**
     * 支付信息
     */
    PaymentInfo payInfo;


    /**
     * 是否有改期
     */
    private String haveChange;

    /**
     * 是否有退票
     */
    private String haveRefund;

    /**
     * 状态链
     */
    private OrderStatusChain orderStatusChain;


    /**
     * 旅客信息集合
     */
    private List<TicketPassengerInfo> passengerInfos;

    /**
     * 航段信息集合
     */
    private OrderSegment orderSegment;


    private PsgAndLinkManInfo psgInfo;

    /**
     * 大订单展示状态码
     */
    private String superStatus;

}
