package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

@Data
public class IrrRefundValidatorResp {
    /**
     * 非自愿是否航班原因
     */
    private String conformPolicy;

    /**
     * 非自愿是否疫情原因
     */
    private String irr;

    /**
     * 航司
     */
    private String airCode;

    /**
     * 错误码
     */
    private Long erroCode;

    /**
     * 错误信息
     */
    private String erroMessage;

}
