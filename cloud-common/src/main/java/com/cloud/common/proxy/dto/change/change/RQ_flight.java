package com.cloud.common.proxy.dto.change.change;

import lombok.Data;

import java.io.Serializable;
import java.util.Map;

@Data
public class RQ_flight implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = -319046797726009786L;

    // 舱位信息,key为舱位，如Y，value为舱位具体信息对象
    private Map<String, RQ_PriceClass> prices;
    // 具体航段信息
    private RQ_Segment segment;


}