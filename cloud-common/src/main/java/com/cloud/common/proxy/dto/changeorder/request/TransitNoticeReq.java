package com.cloud.common.proxy.dto.changeorder.request;

import com.umetrip.air.order.service.dto.changeorder.FlightInfo;
import lombok.Data;

import java.io.Serializable;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 中转须知服务接口请求
 *
 * @author yangsl
 * @version 1.0
 * @date 2022/4/12 10:01
 */
@Data
public class TransitNoticeReq implements Serializable {
    private static final long serialVersionUID = -3939067465024586179L;

    /**
     * Key值
     */
    private String sessionId;
    /**
     * 订单号
     */
    private String orderNo;
    /**
     * 用户选择的航班信息
     */
    List<FlightInfo> flightInfoList;

    /**
     * 获取航段唯一标识
     *
     * @author yangsl
     * @date 2022/4/12 14:17
     * @return List<String>
     */
    public List<String> getSegmentKeyList() {
        return flightInfoList.stream().map(v -> String.join("_", v.getFlightNo(), v.getFlightDate(), v.getDeptCode(), v.getDestCode())).distinct().collect(Collectors.toList());
    }
}
