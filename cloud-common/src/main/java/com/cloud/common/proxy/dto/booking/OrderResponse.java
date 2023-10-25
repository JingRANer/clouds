package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;


/**
 * 创建时间：2018/9/11
 * @author xssun
 */
@Data
public class OrderResponse implements Serializable{

    private static final long serialVersionUID = 1L;

    public OrderResponse(long errCode, String errMsg) {
        this.resultCode = (int) errCode;
        this.message = errMsg;
    }

    public OrderResponse() {
        this.resultCode = 0;
        this.message = "成功";
    }

    /**
     * 返回码 0代表正确，其他代表错误
     */
    private int resultCode;

    /**
     * 错误提示信息
     */
    private String message;

    /**
     * 返回的订单信息
     */
    private List<TicketOrderInfo> ticketOrderInfoList;

    private String payInfo;

    private String orderId;

    private RefreshPrice refreshPrice;

    /**
     * 收银台需要的参数
     */
    private String bizContent;

    /**
     * 收银台需要的签名信息
     */
    private String signature;

    private List<String> orderNoList;

    /**
     * 所有预订成功
     */
    private Boolean allBookingSuccess = true;

    /**
     * 附属订单结果列表
     */
    private List<AddOrderResponse> addOrderList;

    /**
     * 主订单结果
     */
    private AddOrderResponse majorOrderInfo;

    /**
     * 支持变价后下单
     */
    private Boolean refreshPriceCreateOrder;

    /**
     * 变价信息
     */
    private List<RefreshPriceInfo> refreshPriceInfoList;

    /**
     * 变价后总金额
     */
    private BigDecimal refreshTotalPrice;

    /**
     * 因变价下单失败的订单号
     */
    private String refreshPriceFailOrderNo;

    public void refreshOrderMsg(Integer errCode, String errMsg, String orderNo) {
        this.resultCode = errCode;
        this.message = errMsg;
        this.orderId = orderNo;
    }

    public void refreshPayInfo(String bizContent, String payInfo, String signature,String orderId) {
        this.bizContent = bizContent;
        this.payInfo = payInfo;
        this.signature = signature;
        this.orderId = orderId;
    }


    /**
     * 提示错误码
     */
    private Long tipsCode;

    /**
     * 提示信息
     */
    private String tipsMsg;

    public OrderResponse(long errCode, String errMsg, long tipsCode, String tipsMsg) {
        this.resultCode = (int) errCode;
        this.message = errMsg;
        this.tipsCode = tipsCode;
        this.tipsMsg = tipsMsg;
    }

    /**
     * 下单倒计时
     */
    private String paymentTimeout;


}
