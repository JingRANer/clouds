package com.cloud.common.proxy.dto;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author zy
 * @date 2020/3/20
 */
@Data
public class Parameter implements Serializable {
    private static final long serialVersionUID = -3146804969465439280L;
    private String sessionParams;
    private WeexParams weexParams;

}
