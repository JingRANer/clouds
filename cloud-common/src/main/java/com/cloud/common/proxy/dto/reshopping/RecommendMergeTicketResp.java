package com.cloud.common.proxy.dto.reshopping;

import com.umetrip.air.order.service.dto.BaseResponse;
import lombok.Data;

/**
 * @desc: 舱位详情页面返回数据
 * @author: liwenjie
 * @date: 2019/04/12
 * @time: 19:37
 */
@Data
public class RecommendMergeTicketResp extends BaseResponse {

    private static final long serialVersionUID = 2261911839998030301L;
    /**
     * 去程航班信息(包含中转)
     */
    SearchTicketDetailInfo departureTripInfo;

    /**
     * 返程航班信息(包含中转)
     */
    SearchTicketDetailInfo returnTripInfo;

    public RecommendMergeTicketResp(int errCode, String errMsg) {
        super(errCode, errMsg);
    }

    public RecommendMergeTicketResp(long errCode, String errMsg) {
        super(errCode, errMsg);
    }
}
