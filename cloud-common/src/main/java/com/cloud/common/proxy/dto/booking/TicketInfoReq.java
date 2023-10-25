package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2020-11-19
 */
@Data
public class TicketInfoReq implements Serializable {
    private static final long serialVersionUID = -799282132135075976L;

    /**
     * 用户Id
     */
    private String userId;

    /**
     * 查询开始时间
     */
    private String startTime;

    /**
     * 查询结束时间
     */
    private String endTime;

}
