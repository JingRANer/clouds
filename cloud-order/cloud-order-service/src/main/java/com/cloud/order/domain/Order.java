package com.cloud.order.domain;

import lombok.Data;

import java.util.Date;
import java.util.List;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Order
 * @create: 2024-12-15 21:05
 **/

@Data
public class Order {

    /**
     * 自增id
     */
    protected Long id;

    /**
     * 航旅子订单号
     */
    protected String orderNo;

    /**
     * 航司子订单号
     */
    protected String airlineSubOrderNo;

    /**
     * 操作人用户ID
     */
    protected String userId;

    /**
     * 航司二字码
     */
    protected String airline;

    /**
     * 订单状态
     */
    protected String status;

    /**
     * 创建时间
     */
    protected Date createTime;

    /**
     * 更新时间
     */
    protected Date updateTime;

    /**
     * 审核时间
     */
    protected Date auditTime;

    /**
     * 订单支付截止时间
     */
    protected Date expiredTime;

    /**
     * 调用渠道接口成功时间
     */
    protected Date doneTime;

    /**
     * 重试次数
     */
    protected Integer retryCount;

    /**
     * 联系人姓名
     */
    protected String contactName;

    /**
     * 联系电话
     */
    protected String contactPhone;

    /**
     * 错误码
     */
    protected Integer errCode;

    /**
     * 错误原因
     */
    protected String errMsg;

    /**
     * 取消订单时间
     */
    protected Date cancelTime;

    /**
     * 取消原因，用户主动取消选择的原因。 或者未支付自动取消原因为：“超时自动取消”
     */
    protected String cancelReason;

    /**
     * 订单总票价
     */
    protected Long totalPrice;

    /**
     * 订单总税额
     */
    protected Long totalTax;

    /**
     * 用户提交金额，用于退票场景，记录用户当时申请金额。
     */
    protected Long applyTotalPrice;

    /**
     * 与订单类型有关
     */
    protected Long totalCommission;

    /**
     * 订单总交易金额
     * 改期订单时为改期手续费+差价
     * 退票订单时为退票手续费
     * (需退金额：原收费金额-手续费)
     */
    protected Long totalCharge;

    /**
     * 订单类型。
     */
    protected String orderType;

    /**
     * 销售渠道 CZ，ASMS等
     */
    protected String source;

    /**
     * 退票类型  0：自愿 1：非自愿
     */
    protected Integer irrType;

    /**
     * 退票原因
     */
    protected String irrReason;

    /**
     * 退票材料存储文件key
     * 改期材料存储文件key ;分割
     */
    protected String irrFileKeys;

    /**
     * 原始订单号。当当前订单是CHANGE或REFUND时，需要关联原订单号。
     */
    protected String oriOrderNo;

    /**
     * 航旅大订单号
     */
    protected String superOrderNo;

    /**
     * 支付渠道
     */
    protected Integer payChannel;

    /**
     * 预订记录编号（针对美程拼单情况记录pnr）
     */
    protected String pnr;

    /**
     * 0：不支持二次申退接口
     * 1：可以提交二次申退
     */
    protected Integer secondRefund;

    /**
     * 原订单状态
     */
    protected String oriStatus;
    /**
     * 旅客信息
     */
    protected List<Passenger> passengerList;
    /**
     * 服务列表
     */
    protected List<Service> serviceList;
    /**
     * 支付信息
     */
    protected List<Payment> paymentList;

    /**
     * context信息（搜索时带过来的context信息）
     */
    protected String context;

    /**
     * 查询出来的原始订单状态
     */
    protected String preStatus;

    /**
     * 是否支持再次提交0 不可在此单提交再次退票;1 可以再此单提交再次退票
     */
    private Integer supportResubmit;


    /**
     * 使用渠道
     * <p>
     * 用于区分app，微信小程序等来源，如果为空，默认是app
     * 值为“app”或“wx”
     */
    private String sourceFrom;

    /**
     * 订单的前项来源
     */
    protected String orderSource;

    /**
     * 联系电话编码
     */
    private String contactPhoneCode;

    /**
     * 联系人姓名编码
     */
    private String contactNameCode;

}
