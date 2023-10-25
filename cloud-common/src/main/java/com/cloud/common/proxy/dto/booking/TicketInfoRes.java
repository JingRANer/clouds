package com.cloud.common.proxy.dto.booking;


import com.umetrip.air.order.service.dto.BaseResponse;
import com.umetrip.air.order.service.dto.order.SegmentInfo;
import lombok.Data;

import java.util.List;

/**
 * @author zcy
 * @Date 2020-11-19
 */
@Data
public class TicketInfoRes extends BaseResponse {

    private static final long serialVersionUID = -8035857631973394566L;

    public TicketInfoRes(){
        super();
    }

    public TicketInfoRes(long errCode, String errMsg) {
        super(errCode, errMsg);
    }

    private List<SegmentInfo> segmentInfos;




}
