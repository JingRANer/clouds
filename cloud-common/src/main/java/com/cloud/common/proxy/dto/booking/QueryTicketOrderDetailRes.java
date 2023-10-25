package com.cloud.common.proxy.dto.booking;

import com.umetrip.uframe.common.exception.ErrorCode;
import lombok.Data;

import java.io.Serializable;
/**
 * @author Administrator
 */
@Data
public class QueryTicketOrderDetailRes  implements Serializable {
    /**
     * 订单详情查询
     */
    private TicketOrderDetail ticketOrderInfo;
    /**
     * 返回错误信息
     */
    private ErrorCode errorCode;
}
