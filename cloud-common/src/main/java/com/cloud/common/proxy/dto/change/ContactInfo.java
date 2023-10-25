package com.cloud.common.proxy.dto.change;

import lombok.Data;

/**
 * @author zcy
 * @Date 2022-01-06
 */
@Data
public class ContactInfo {

    /**
     * 联系人姓名
     */
    private String contactName;

    /**
     * 联系人电话
     */
    private String contactTel;
}
