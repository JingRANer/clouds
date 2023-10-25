package com.cloud.common.proxy.dto.improperflight;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lde
 * @create 2021/11/19
 */
@Data
public class ImproperFlightInitServiceResp implements Serializable {

    private static final long serialVersionUID = 7864288049093977448L;

    private List<String> tktNoCoupons;

    private String source;

}
