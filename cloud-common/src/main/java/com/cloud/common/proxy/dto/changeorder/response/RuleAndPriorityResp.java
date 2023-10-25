package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.BaseResponse;
import com.umetrip.air.order.service.dto.changeorder.rulepriority.FareFamilyDesc;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 退改签规则和行李规定响应参数
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/6 10:45
 */
@Data
public class RuleAndPriorityResp extends BaseResponse implements Serializable {
    private static final long serialVersionUID = -5550091581197824832L;
    /**
     * 改期SessionId
     */
    private String sessionId;
    /**
     * 航班信息
     */
    private List<FareFamilyDesc> fareFamilyDescList;
}
