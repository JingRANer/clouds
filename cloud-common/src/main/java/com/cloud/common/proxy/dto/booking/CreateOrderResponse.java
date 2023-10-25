package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author lde
 * @create 2022/4/1
 */
@Data
public class CreateOrderResponse implements Serializable {

    private static final long serialVersionUID = 3333650399501565692L;

    /**
     * 结果代码
     */
    private int resultCode;
    /**
     * 错误信息
     */
    private String errMsg;

    /**
     * 订单号列表
     */
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
    private Boolean refreshPriceCreateOrder = false;

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


    public CreateOrderResponse() {
    }

    public CreateOrderResponse(int resultCode, String errMsg) {
        this.resultCode = resultCode;
        this.errMsg = errMsg;
    }

    public CreateOrderResponse(int resultCode, String errMsg, Boolean refreshPriceCreateOrder, List<RefreshPriceInfo> refreshPriceInfoList, BigDecimal refreshTotalPrice, String refreshPriceFailOrderNo) {
        this.resultCode = resultCode;
        this.errMsg = errMsg;
        this.refreshPriceCreateOrder = refreshPriceCreateOrder;
        this.refreshPriceInfoList = refreshPriceInfoList;
        this.refreshTotalPrice = refreshTotalPrice;
        this.refreshPriceFailOrderNo = refreshPriceFailOrderNo;
    }

    /**
     * 下单倒计时
     */
    private String paymentTimeout;
}
