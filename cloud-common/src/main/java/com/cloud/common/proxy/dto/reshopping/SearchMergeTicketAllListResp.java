package com.cloud.common.proxy.dto.reshopping;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zhouj
 * @date 2019/11/7 15:27
 */
@Data
public class SearchMergeTicketAllListResp extends BaseResponse implements Serializable {

    /**
     * 去程可售航班列表
     */
    List<MultiSearchTicketInfo> sellDepartureTripList;
    /**
     * 返程可售航班列表
     */
    List<MultiSearchTicketInfo> sellReturnTripList;

    /**
     * sessionId
     */
    private String sessionId;

    public SearchMergeTicketAllListResp(){
        super();
    }

    public SearchMergeTicketAllListResp(long errCode, String errMsg){
        super(errCode, errMsg);
    }
}
