package com.cloud.common.proxy.dto.refund;

import lombok.Data;

/**
 * @author lde
 * @create 2021/10/26
 */
@Data
public class PredictMoneyDetail {

    /**
     * 是否暂无估价(航司接口返回暂无估价，退票规则解析无估价)
     * false:有预估退票费 true:暂无估价
     */
    private boolean haveValuation;

    /**
     * 预估退票总金额
     */
    private String refundAllFee;

    /**
     * 预估退票燃油费
     */
    private String refundFuelTexFee;

    /**
     * 预估退票基建费
     */
    private String refundAirportTexFee;

    /**
     * 成人退票费
     */
    private String adultRefundFee;

    /**
     * 儿童退票费
     */
    private String childRefundFee;

    /**
     * 成人退还金额
     */
    private String adultRefundAmount;

    /**
     * 儿童退还金额
     */
    private String childRefundAmount;

    /**
     * 婴儿退票费
     */
    private String infantRefundFee;

    /**
     * 婴儿退还金额
     */
    private String infantRefundAmount;

}
