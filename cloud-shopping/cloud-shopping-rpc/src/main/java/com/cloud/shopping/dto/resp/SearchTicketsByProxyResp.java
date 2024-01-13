package com.cloud.shopping.dto.resp;

import com.cloud.common.SingleResponse;
import com.cloud.shopping.dto.SearchTicketCacheBean;
import lombok.Data;

import java.io.Serializable;
import java.util.Map;

/**
 * @desc: 通过proxy调用返回的数据
 * @author: liwenjie
 * @date: 2019/06/19
 * @time: 10:09
 */
@Data
public class SearchTicketsByProxyResp implements Serializable {
    private static final long serialVersionUID = -3225205423364652957L;
    /**
     * 航线数据
     */
    Map<String, SearchTicketCacheBean> searchTicketCacheBeanMap;
    /**
     * 航司中转航线数据
     */
//    Map<String, MultiSearchTicketCacheBean> multiSearchTicketCacheBeanMap;
    /**w
     * 报价源
     */
    private String source;
    /**
     * 出发机场三字码
     */
    private String deptAirportCode;
    /**
     * 到达机场三字码
     */
    private String destAirportCode;
    /**
     * 出发日期列表
     */
    private String flightDate;
    /**
     * 航班号列表
     */
    private String flightNo;
    /**
     * 舱位列表
     */
    private String cabins;
    /**
     * 是否携带儿童奶
     */
    private boolean hasChild;
    /**
     * 是否携带婴儿
     */
    private boolean hasInfant;
}
