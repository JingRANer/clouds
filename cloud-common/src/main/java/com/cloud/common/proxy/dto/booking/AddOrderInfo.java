package com.cloud.common.proxy.dto.booking;

import lombok.Data;

/**
 * @author lde
 * @create 2022/6/8
 */
@Data
public class AddOrderInfo {

    /**
     * 产品单价金额
     * 用于计算总费用，配合乘机人列表使用
     */
    private String price;

    /**
     * 产品订单总价
     */
    private String amount;

    /**
     * 下单必要参数
     * json结构，由附属商户推荐返回，总金额由主商户生成
     */
    private String createOrderContent;

    /**
     * 附属商户代码
     * 判断需要下哪个附属商户订单
     */
    private String businessCode;

    /**
     * 附属商户名称
     * 保险的险种名或“行程单邮寄”
     */
    private String businessName;

}
