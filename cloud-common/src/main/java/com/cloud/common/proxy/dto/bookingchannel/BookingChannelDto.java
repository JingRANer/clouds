package com.cloud.common.proxy.dto.bookingchannel;

import lombok.Data;

import java.util.Set;

@Data
public class BookingChannelDto {

    /**
     * 渠道代号
     */
    protected String source;

    /**
     * 往返程是否拆分service
     */
    protected Boolean isNeedSplitService;

    /**
     * 不支持主动取消订单
     */
    protected Boolean isNotSupportCancelOrder;

    /**
     * 是否需要使用DMZ
     */
    protected Boolean useDmz;

    /**
     * 是否是分销渠道(如美程)
     */
    protected Boolean isDistributionChannel;

    /**
     * --------------------------------------
     * 支付相关能力
     * --------------------------------------
     */

    /**
     * 收款方式(航旅自收 航司自收 航旅托管 对应Constants.PAY_CHANNEL_XXX)
     * 航司自收情况下, 在获取支付参数时需要缓存
     */
    protected int payChannel;

    /**
     * 支付渠道(对应 支付宝 微信支付 航旅支付)
     */
    protected Boolean supportAliPay;
    protected Boolean supportWeChatPay;
    protected Boolean supportUmePay;

    /**
     * 是否需要创单时获取支付参数进行验证
     */
    protected Boolean needAdvanceGetPayParam;

    /**
     * 是否接收支付回调
     */
    protected Boolean isAcceptPayCallback;

    /**
     * 是否为一次接口调用完成支付、出票（航司自收方式）
     */
    protected Boolean payIssueInSingleCall;

    /**
     * 商户ID
     */
    protected String tenantId;

    /**
     * 支付渠道标识
     */
    protected String accountId;

    /**
     * 产品名称
     */
    protected String productName;

    /**
     * 产品描述
     */
    protected String productDesc;

    /**
     * 支付超时取消时间(秒)
     */
    protected int paymentTimeout;

    /**
     * 支付加密秘钥
     */
    protected String paySecretKey;

    /**
     * --------------------------------------
     * 创单相关能力
     * --------------------------------------
     */

    /**
     * 创建银行订单号方式(航旅支付提供 机票销售业务创建 航司提供订单号 对应Constants.TENANT_ORDER_ID_GEN_WAY_XXX)
     */
    protected String tenantOrderIdGenWay;

    /**
     * 是否需要解析订单详情中旅客加密的姓名
     */
    protected Boolean needDecodePassengerName;

    /**
     * 下单前价格校验不一致，是否需要刷新航段价格
     */
    protected Boolean needRefreshSegmentPrice;

    /**
     * 是否提供客票状态查询接口
     */
    protected Boolean supportTicketStateInterface;

    /**
     * 最多支持人数
     */
    protected int maxSupportPassengerCount;

    /**
     * 是否支持儿童
     */
    protected Boolean supportChildPassenger;

    /**
     * 是否支持婴儿
     */
    protected Boolean supportBabyPassenger;

    /**
     * 是否支持往返程
     */
    protected Boolean supportRoundTrip;

    /**
     * 支付失败后是否支持重新预定
     */
    protected Boolean supportRebook;

    /**
     * 下单金额校验方式(供应商 航旅 对应Constants.ORDER_PRICE_VERIFY_XXX)
     */
    protected String orderPriceVerifyWay;

    /**
     * 出票时间限制(单位：分钟 无需主动出票的渠道不关注是否超时)
     */
    protected int issueTimeLimit;

    /**
     * --------------------------------------
     * 改期相关能力
     * --------------------------------------
     */

    /**
     * 是否支持改期
     */
    protected Boolean supportChangeOrder;


    /**
     * 不支持改期主动取消订单
     */
    protected Boolean isNotSupportCancelChangeOrder;

    /**
     * 是否支持改后改 MU ASMS
     */
    protected Boolean supportSecondChange;

    /**
     * 是否支持多人改期
     */
    protected Boolean supportMultiPsgChange;

    /**
     * 是否支持中转改期
     */
    protected Boolean supportTransferChange;

    /**
     * 是否支持往返改期
     */
    private Boolean supportRoundTripChange;

    /**
     * 是否支持机票订单取消
     */
    protected Boolean supportTicketOrderCancel;

    /**
     * 是否支持改期订单取消
     */
    protected Boolean supportChangeOrderCancel;

    /**
     * 支持改期的航司列表(适用于分销渠道, 否则以this.supportChangeOrder为准)
     */
    protected Set<String> supportChangeOrderSet;

    /**
     * 是否需要改期审核
     */
    protected Boolean needChangeOrderAudit;

    /**
     * 是否提供改期出票接口
     */
    protected Boolean supportChangeOrderIssueInterface;

    /**
     * 调用航司接口查看改期订单详情 是否需要传递AirlineOrderNo
     */
    protected Boolean needAirlineOrderNo;


    /**
     * 是否支持多个ChannelOrder
     */
    protected Boolean supportMoreChannelOrder;

    /**
     * 当前航司是否支持支付失败后重新预订
     */
    protected boolean supportChangeRebook;


    /**
     * 改期出票超时取消时间(分钟)
     */
    protected int changeIssueTimeout;

    /**
     * 改期差错退款时间范围(天）
     */
    protected int changeErrorRefundTimeOut;


    /**
     * --------------------------------------
     * 退票相关能力
     * --------------------------------------
     */

    /**
     * 是否要求往返程同时退
     */
    protected Boolean requireCancelRoundTrip;

    /**
     * 是否支持再次申退
     */
    protected Boolean supportSecondRefund;

    /**
     * 再次申退方式(普通退票接口 再次申退接口 对应Constants.SECOND_REFUND_WAY_XXX)
     */
    protected String secondRefundWay;

    /**
     * 退票信息获取方式(来源为订单详情 来源为退票详情 对应Constants.REFUND_INFO_GET_WAY_XXX)
     */
    protected String refundInfoGetWay;

    /**
     * 退票时是否要全退本订单未使用航段
     */
    protected Boolean requireCancelAllUnusedSegment;

    /**
     * 是否需要调用接口获取退票费
     */
    protected Boolean needGetRefundFeeThroughProxy;

    /**
     * 退票费接口调用失败, 是否仍可继续退票
     */
    protected Boolean supportRefundWhenFailRefundFee;

    /**
     * 查询退票费时, 儿童信息是否为必须
     */
    protected Boolean requireChildInfo;

    /**
     * 查询退票费时, 是否需要查询航司订单详情
     */
    protected Boolean requireOrderInfoFromProxy;

    /**
     * 是否需要主动查询退票退款状态
     */
    protected Boolean needActiveQueryRefundState;

    /**
     * 是否通知退款结果
     */
    protected Boolean needNotifyRefundResult;

    /**
     * 是否支持多人一块提退
     */
    protected Boolean supportRefundMultiPassenger;

    /**
     * 是否支持差错退款
     */
    protected Boolean supportErrorRefund;

    /**
     * 最大退票次数
     */
    protected Integer maxRefundTimes;

    /**
     * 最大付款次数
     */
    protected Integer maxPayTimes;

    /**
     * 非自愿退票是否需要审核
     */
    protected Boolean involuntaryNeedAudit;

    /**
     * 取消座位时是否需要审核
     */
    protected Boolean noSeatNeedAudit;

    /**
     * 渠道支持成人儿童比例
     */
    protected int adultChildScaleValue;
    /**
     * 临近航班出票时间
     * */
    protected int approachingOrderIssueTimeLimit;
}
