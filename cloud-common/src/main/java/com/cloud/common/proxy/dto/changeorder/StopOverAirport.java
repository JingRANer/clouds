package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class StopOverAirport implements Serializable {

    private static final long serialVersionUID = -6342381335642749079L;

    /**
     * 经停序号
     */
    private Integer index;

    /**
     * 经停机场三字码
     */
    private String airportCode;

    /**
     * 经停航站楼
     */
    private String airportTerminal;

    /**
     * 经停到达时间
     */
    private String arrDateTime;

    /**
     * 经停起飞时间
     */
    private String deptDateTime;

    /**
     * 经停时间
     */
    private String remainTime;
}
