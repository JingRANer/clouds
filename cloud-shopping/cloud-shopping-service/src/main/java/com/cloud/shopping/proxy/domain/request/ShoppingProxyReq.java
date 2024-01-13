package com.cloud.shopping.proxy.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * @ClassName : ShoppingProxyReq
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 09:41
 */
@Data
public class ShoppingProxyReq {

    private static final long serialVersionUID = 301685136656469262L;

    private String source;

    /**
     * 航司两字码
     */
    private String airline;

    /**
     * 用户id
     */
    private String userId;

    /**
     * 出发机场三字码
     */
    private String deptCode;

    /**
     * 到达机场三字码
     */
    private String destCode;

    /**
     * 去程日期
     */
    private String deptDate;

    /**
     * 搜索类型 OW 单程 RT 往返 MT 联程
     */
    private String journeyType;

    /**
     * 是否携带儿童
     */
    private boolean hasChild;

    /**
     * 是否携带婴儿
     */
    private boolean hasInfant;


}
