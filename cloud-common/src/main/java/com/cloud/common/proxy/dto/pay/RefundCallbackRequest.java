package com.cloud.common.proxy.dto.pay;

import java.io.Serializable;

/**
 * Created by lyxbai on 2018/12/19.
 * @author lyxbai
 */
public class RefundCallbackRequest implements Serializable {
    private static final long serialVersionUID = -1304196530519477224L;

    /**
     * 青岛航退款单号
     */
    private String airlineRefundNo;
    /**
     * 退款状态
     */
    private String refundStatus;

    /**
     * 退款失败原因
     */
    private String errorDesc;

    /**
     * 退款金额（分）
     */
    private Integer refundAmount;

    public String getAirlineRefundNo() {
        return airlineRefundNo;
    }

    public void setAirlineRefundNo(String airlineRefundNo) {
        this.airlineRefundNo = airlineRefundNo;
    }

    public String getRefundStatus() {
        return refundStatus;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public String getErrorDesc() {
        return errorDesc;
    }

    public void setErrorDesc(String errorDesc) {
        this.errorDesc = errorDesc;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }







}
