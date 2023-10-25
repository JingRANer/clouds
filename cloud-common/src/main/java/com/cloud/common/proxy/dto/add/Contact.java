package com.cloud.common.proxy.dto.add;

import lombok.Data;

import java.io.Serializable;

/**
 * @author dcy
 * @ClassName Contact.java
 * @Description TODO
 * @createTime 2022年06月07日 17:29
 */
@Data
public class Contact implements Serializable {
    private static final long serialVersionUID = 9108817848819616374L;

    /**
     * 联系人姓名
     */
    private String contactName;
    /**
     * 联系人电话
     */
    private String contactMobile;
}
