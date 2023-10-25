package com.cloud.common.proxy.dto.pay;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

/**
 * Created by Gavin on 2019/4/17.
 * @author lyxbai
 */
@Data
public class GetPayInfoParamsRes extends BaseResponse {

    private static final long serialVersionUID = 7933033522803387744L;

    public GetPayInfoParamsRes(){
        super();
    }

    public GetPayInfoParamsRes(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    /**
     * 应用id
     * @must 微信必须
     */
    private String appId;

    /**
     * 商户号
     * @must 微信必须
     */
    private String partnerId;

    /**
     * 预支付交易会话ID
     * @must 微信必须
     */
    private String prepayId;

    /**
     * 扩展字段（暂填固定值Sign=WXPay）
     * @must 微信必须
     */
    private String packageId;

    /**
     * 随机字符串
     * @must 微信必须
     */
    private String noncestr;

    /**
     * 时间戳
     * @must 微信必须
     */
    private String timeStamp;

    /**
     * 签名
     * @must 微信必须
     */
    private String sign;

    /**
     * 新支付宝支付串
     * @must 支付宝必须
     */
    private String orderString;

    /**
     * 支付方式：301,302
     */
    private String pluginId;

    /**
     * 老支付宝支付串
     * @must 支付宝必须
     */
    private String signString;

    private String signType;

    private String aliOrderSpecLink;
}
