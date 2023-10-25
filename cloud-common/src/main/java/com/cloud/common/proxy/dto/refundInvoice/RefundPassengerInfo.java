package com.cloud.common.proxy.dto.refundInvoice;

import lombok.Data;

/**
 * @ClassName : RefundPassengerInfo
 * @Description :
 * @Author : jzy
 * @Date: 2021-08-31 15:26
 */
@Data
public class RefundPassengerInfo {
    /**
     * 乘机人姓名
     */
    private String passengerName;
    /**
     * 证件号
     */
    private String passengerCertNo;
    /**
     * 航线
     */
    private String route;
    /**
     *  航班日期
     */
    private String flightDate;
    /**
     * 航班号
     */
    private String flightNo;
    /**
     * 票号
     */
    private String TktNo;
    /**
     * 金额
     */
    private String amount;
    /**
     * 是否提交过退票
     */
    private boolean isSubmit;
    /**
     * 对应航段ID
     */
    private String segmentId;

}
