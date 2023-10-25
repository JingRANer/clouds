package com.cloud.common.proxy.dto.queryorder;

import lombok.Data;

/**
 * @author lde
 * @create 2022/3/24
 */
@Data
public class PassengerInfo {

    /**
     * 乘客id
     */
    private String passengerId;
    /**
     * 名字
     */
    private String name;
    /**
     * 乘客类型
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
     * 手机号
     */
    private String mobile;

    /**
     * 婴儿相关绑定人
     */
    private String infantRelevanceId;


}
