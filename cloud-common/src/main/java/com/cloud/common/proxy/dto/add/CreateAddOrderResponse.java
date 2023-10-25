package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName CreateAddOrderRespon.java
 * @Description TODO
 * @createTime 2022年06月07日 17:06
 */
@Data
public class CreateAddOrderResponse implements Serializable {

    private static final long serialVersionUID = 1445365267571820054L;

    /**
     * 附属商户订单号
     */
    private String orderNo;
    /**
     * 商户ID
     */
    private String merchantId;
    /**
     * 附属商户支付订单号
     */
    private String paymentId;
    /**
     * 银行订单号
     */
    private String tenantOrderId;
    /**
     * 商品名称
     */
    private String productName;
    /**
     * 商品描述
     */
    private String productDesc;
    /**
     * 支付回调方式
     */
    private String notifyType;
    /**
     * 支付回调地址
     */
    private String notifyUrl;
    /**
     * 附属订单跳转详情页参数
     * 用于调转使用，字段比较长
     */
    private String jumpParameter;
    /**
     * 附属订单描述
     * 用于主订单详情页展示附属订单使用，示例：意外保险 50 X 1份
     * {"name" : "行程单邮寄",
     * "price" : "50",
     * "num":"1"
     * "unit":"份"
     * "agreement":"[{\"text\":\"行程单同意文档须知\"},{\"text\":\"行程单同意文档须知2\",\"url\",\"http://www.um.asdf\"}]"
     * }（第一个对象是标题，后续对象是文档+链接）
     */
    private String showContent;

}
