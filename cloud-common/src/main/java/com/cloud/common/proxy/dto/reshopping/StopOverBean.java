package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

/**
 * @desc: 存放经停信息
 * @author: liwenjie
 * @date: 2019/05/22
 * @time: 19:32
 */
@Data
public class StopOverBean implements Serializable {
    private static final long serialVersionUID = 3586099651458369835L;
    /**
     * 三字码
     */
    private String airportCode;
    /**
     * 机场名
     */
    private String cityName;
    /**
     * 城市名
     */
    private String airportName;

    /**
     * 停留时间
     */
    private String time;

    /**
     * 经停航站楼
     */
    private String terminal;
}
