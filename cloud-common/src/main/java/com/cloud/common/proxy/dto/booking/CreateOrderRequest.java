package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2022/4/1
 */
@Data
public class CreateOrderRequest implements Serializable {

    private static final long serialVersionUID = -7961038824179188435L;
    /**
     * 用户Id
     */
    private String userId;

    /**
     * 联系人信息
     */
    private Contact contact;

    /**
     * 旅客信息集合
     */
    private List<PassengerInfo> passengerInfoList;

    /**
     * 价格（实际需要支付）
     */
    private String charge;

    /**
     * 透传字段
     */
    private String createOrderContext;

    /**
     * 是否选择向上推荐
     */
    private boolean isUpgrade;

    /**
     * APP版本号
     */
    private String appVersionNumber;

    /**
     * 组合订单信息
     */
    private ComboOrderInfo comboOrderInfo;
    /**
     * 使用渠道
     *
     * 用于区分app，微信小程序等来源，如果为空，默认是app
     * 值为“app”或“wx”
     */
    private String sourceFrom;
    /**
     * 订单的前项来源
     */
    private String orderSource;

}
