package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class SearchDate implements Serializable {

    private static final long serialVersionUID = -392193410514351649L;
    /**
     * 出发日期
     * 单程时，要改期到的航班日期
     * 往返程时，去程的出发航班日期；
     */
    private String owFlightDate;

    /**
     * 返程日期
     * 往返程时，返程的出发日期
     */
    private String rtFlightDate;
}
