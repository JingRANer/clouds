package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class StopOver implements Serializable {

    private static final long serialVersionUID = 3012141018416055117L;
    /**
     * 经停航班信息
     */
    private List<StopOverAirport> airportList;

    /**
     * 经停数量
     */
    private String count;
}
