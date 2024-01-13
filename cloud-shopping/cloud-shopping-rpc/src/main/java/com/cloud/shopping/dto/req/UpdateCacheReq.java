package com.cloud.shopping.dto.req;

import lombok.Data;

/**
 * @ClassName : UpdateCacheReq
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 14:34
 */
@Data
public class UpdateCacheReq {

    private String source;

    private String deptCode;

    private String destCode;

    private String flightDate;

    private Boolean hasChild;

    private Boolean hasInfant;

//    private UpdateProxyCaller updateProxyCaller;

    private String reserveCabin;

    private String reserveFlightNo;

    /**
     * 渠道
     */
    private String channel;

}
