package com.cloud.common.proxy.dto.changeorder.request;

import com.umetrip.air.order.service.dto.changeorder.SearchRoute;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;
import org.apache.dubbo.common.utils.CollectionUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-06
 */
@Data
public class CheckChangeDetailRequest  implements Serializable {

    private static final long serialVersionUID = 253439526921629611L;


    /**
     * 缓存id
     */
    private String sessionId;

    /**
     * 航班查询信息
     */
    private List<SearchRoute> searchRouteList;


    /**
     * 改期选择舱位页参数校验
     ** @return 校验结果
     */
    public boolean valid() {
        if (StringUtils.isAnyBlank(sessionId) || CollectionUtils.isEmpty(searchRouteList)) {
            return false;
        }
        return true;
    }
}
