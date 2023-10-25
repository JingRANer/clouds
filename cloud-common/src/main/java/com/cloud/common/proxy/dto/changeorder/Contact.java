package com.cloud.common.proxy.dto.changeorder;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Contact implements Serializable {
    private static final long serialVersionUID = -6875339858234037934L;

    /**
     * 联系人姓名
     */
    private String name;

    /**
     * 联系人联系方式
     */
    private String mobile;
}
