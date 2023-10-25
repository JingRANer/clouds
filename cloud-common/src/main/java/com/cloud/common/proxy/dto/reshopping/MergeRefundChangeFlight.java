package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;

@Data
public class MergeRefundChangeFlight implements Serializable {
    private static final long serialVersionUID = 1L;
    /**
     * 航司二字码
     *
     * @mock HU
     */
    private String airline;

    /**
     * 当前舱位
     *
     * @mock Q
     */
    private String cabin;
    /**
     * 航司个性化或者通用化描述内容
     *
     * @mock 航司针对退改签的描述
     */
    private String rcDesc;

    /**
     * 底部的个性化描述
     *
     * @mock 航司底部针对退改签的描述
     */
    private String bottomDesc;

    /**
     * 飞行方向，标识去程和返程用，原样返回
     * G去程，  B返程
     *
     * @mock G
     */
    private String flightDirection;

    /**
     * 舱位产品 COMMONY
     */

    private String cabinProduct;
    /**
     * 北京-上海 航班号
     */

    private String flightDesc;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 到达地三字码
     */
    private String destCode;
}
