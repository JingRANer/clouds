package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2022/7/28
 */
@Data
public class RefreshPriceCreateTicketOrderReq implements Serializable {

    private static final long serialVersionUID = -3257022400779898731L;

    /**
     * 旅客信息集合
     */
    private List<PassengerInfo> passengerInfoList;

    /**
     * 因变价下单失败的订单号
     */
    private String refreshPriceFailOrderNo;

    /**
     * 刷新价格信息
     */
    private List<RefreshPriceInfo> refreshPrice;

    /**
     * 组合订单信息
     */
    private ComboOrderInfo comboOrderInfo;

    /**
     * 总价
     */
    private String totalCharge;

}
