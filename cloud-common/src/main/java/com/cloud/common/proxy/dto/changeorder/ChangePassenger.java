package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ChangePassenger implements Serializable {

    private static final long serialVersionUID = -241701033293724721L;
    /**
     * 乘客id，用来找原单要改期的乘客信息
     * @mock 1203449949290200003
     */
    private String passengerId;

    /**
     * 乘客姓名
     */
    private String name;

    /**
     * 乘客类型
     * A - 成人
     * C - 儿童
     * I - 婴儿
     */
    private String type;

    /**
     * 证件类型
     */
    private String certType;

    /**
     * 证件号
     */
    private String certNo;

    /**
     * 选定的改期航段
     */
    private List<ChangeSegment> changeSegments;


}
