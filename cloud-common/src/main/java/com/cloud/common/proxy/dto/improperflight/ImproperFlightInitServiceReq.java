package com.cloud.common.proxy.dto.improperflight;

import lombok.Data;

import java.util.List;

/**
 * @author lde
 * @create 2021/11/19
 */
@Data
public class ImproperFlightInitServiceReq {

    List<TicketInfo> ticketInfos;

    String orderNo;

    String sessionId;
}
