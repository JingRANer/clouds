package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @desc: 机票舱位详情数据，用于返回中台
 * @author: liwenjie
 * @date: 2019/04/28
 * @time: 19:59
 */
@Data
public class SearchTicketDetailInfo implements Serializable {
    /**
     * 出发机场三字码
     */
    private String deptCode;
    /**
     * 到达机场三字码
     */
    private String destCode;
    /**
     * 出发机场名
     */
    private String deptAirportName;
    /**
     * 到达机场名
     */
    private String destAirportName;
    /**
     * 出发城市
     */
    private String deptCityName;
    /**
     * 到达城市
     */
    private String destCityName;
    /**
     * 国际/国内,true:国内,false:国际
     */
    private boolean civil = true;
    /**
     * 航班信息（包含中转航班）
     */
    List<SearchTicketCacheBean> searchTicketCacheBeanList;
    /**
     * 可售舱位组合信息列表
     */
    private List<TicketCabinInfo> sellTicketCabinInfoList;
}
