package com.cloud.common.proxy.dto.change.change.priority;

import lombok.Data;

import java.io.Serializable;

/**
 * @program: umeticket-shopping-topology
 * @description:手提行李
 * @author: hzgao
 * @create: 2020-07-22 10:05
 **/
@Data
public class BaggageCarryonPriority implements Serializable {
    /**
     * 件数-后台做文字拼接
     *
     * @mock 1
     */
    private String pieces;
    /**
     * 免费额度-免费重量单位KG，后台做文字拼接
     *
     * @mock 20
     */
    private String weight;
    /**
     * 文字描述
     *
     * @mock 可免费携带一件7KG且体积不超过20cm x 40cm x 30cm的非托运行李进入客舱
     */
    private String desc;
}
