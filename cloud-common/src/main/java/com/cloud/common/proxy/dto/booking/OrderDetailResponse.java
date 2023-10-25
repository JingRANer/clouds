package com.cloud.common.proxy.dto.booking;

import com.umetrip.air.order.service.dto.BaseResponse;
import com.umetrip.air.order.service.dto.order.*;
import com.umetrip.air.order.service.dto.pay.PayInfo;
import lombok.Data;

import java.util.List;


/**
 * @author lyxbai
 */
@Data
public class OrderDetailResponse extends BaseResponse {

    private static final long serialVersionUID = 4552819578087171910L;

    public OrderDetailResponse(){
        super();
    }

    public OrderDetailResponse(long errCode, String errMsg) {
        super(errCode, errMsg);
    }
    /**
     * 订单状态
     * @mock 已出票
     */
    private String orderStatus;

    /**
     * 订单状态颜色
     * @mock #34435F
     */
    private String orderStatusColor;

    /**
     * 订单状态描述
     * @mock 预计支付成功后30分钟内出票
     */
    private String orderStatusDesc;

    /**
     * 支付倒计时(毫秒)
     * @mock 180000
     */
    private long paymentTimeout;

    /**
     * 订单总金额
     * @mock ￥4300
     */
    private String orderTotalPrice;

    /**
     * 价格详情
     */
    private List<PriceItem> priceDetail;

    /**
     * 状态链描述
     * @mock 3月11日 19:24 您的机票出票成功
     */
    private String statusChainDesc;

    /**
     * 状态链
     */
    private OrderStatusChain orderStatusChain;

    /**
     * 航段信息
     */
    private OrderSegmentInfo orderSegmentInfo;


    /**
     * 出行人信息
     */
    private PsgAndLinkManInfo psgAndLinkManInfo;

    /**
     * 是否有改期
     */
    private String haveChange;

    /**
     * 是否有退票
     */
    private String haveRefund;

    /**
     * 订单信息
     */
    TicketOrderInfo ticketOrderInfo;

    /**
     * 支付信息
     */
    PayInfo payInfo;

    /**
     * 本人购买的航段信息
     */
    List<SegmentInfo> segmentInfoBySelf;

    /**
     * 本人的旅客信息
     */
    List<PassengerInfo> passengerInfoSelf;

    /**
     * 权益信息
     */
    private String equityInfo;

    /**
     * 退改签规则
     */
    private String refundChangeRuler;
    
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
     * 是否需要支付
     */
    private boolean needPay;

}
