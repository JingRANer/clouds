package com.cloud.common.proxy.dto.booking;

import lombok.Data;

/**
 * @author lde
 * @create 2022/4/1
 */
@Data
public class Contact {

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系手机
     */
    private String contactMobile;
}
