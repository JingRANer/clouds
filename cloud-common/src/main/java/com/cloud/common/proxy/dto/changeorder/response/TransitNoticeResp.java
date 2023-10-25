package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.transit.TransitPriority;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 中转须知服务接口响应
 *
 * @author yangsl
 * @date 2022/4/12 10:23
 * @version 1.0
 */
@Data
public class TransitNoticeResp implements Serializable {

    private static final long serialVersionUID = -6398121824025694193L;

    private List<TransitPriority> transitPriorityList;
}
