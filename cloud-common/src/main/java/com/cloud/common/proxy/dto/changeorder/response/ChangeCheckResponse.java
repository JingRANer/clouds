package com.cloud.common.proxy.dto.changeorder.response;

import com.umetrip.air.order.service.dto.changeorder.ChangeSegment;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ChangeCheckResponse implements Serializable {

    private static final long serialVersionUID = 448483891698002220L;
    /**
     * 缓存key值
     */
    private String sessionId;

    /**
     * 风险提示，无陪儿童校验不通过时的提示
     */
    private String reminder;

    /**
     * 改签人的航段信息
     */
    private List<ChangeSegment> changeSegmentList;
}
