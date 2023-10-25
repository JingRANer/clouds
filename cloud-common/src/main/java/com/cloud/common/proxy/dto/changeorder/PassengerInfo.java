package com.cloud.common.proxy.dto.changeorder;

import lombok.Data;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class PassengerInfo implements Serializable {

    private static final long serialVersionUID = 2890038563084780109L;

    /**
     * 乘机人姓名
     */
    private String name;

    /**
     * 乘客类型
     * A-成人
     * C-婴儿
     */
    private String type;

    /**
     * 乘机人证件类型
     */
    private String certType;

    /**
     * 乘机人证件号
     */
    private String certNo;

    /**
     * 联系方式
     */
    private String mobile;
}
