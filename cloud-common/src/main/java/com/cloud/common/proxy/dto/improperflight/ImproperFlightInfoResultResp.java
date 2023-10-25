package com.cloud.common.proxy.dto.improperflight;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2021/11/19
 */
@Data
public class ImproperFlightInfoResultResp implements Serializable {

    private static final long serialVersionUID = -8869145519755971754L;

    /**
     * 客票航班信息查询结果List
     */
    private List<TicketFlightInfo> ticketFlightInfos;

    private long resultCode;

    private String message;


    public ImproperFlightInfoResultResp(long errCode, String errMsg) {
        this.resultCode = (int) errCode;
        this.message = errMsg;
    }

    public ImproperFlightInfoResultResp() {
        this.resultCode = 0;
        this.message = "成功";
    }
}
