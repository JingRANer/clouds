package com.cloud.common.proxy.dto.changeorder.request;

import com.orbitz.apache.commons.lang3.StringUtils;
import com.umetrip.air.order.service.dto.changeorder.Contact;
import lombok.Data;

import java.io.Serializable;

/**
 * @author liwenjie
 * @ClassName ChangeOrderReq.java
 * @Description 改期下单请求
 * @createTime 2022年04月09日 10:04:00
 */
@Data
public class ChangeOrderRequest implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * sessionId
     */
    private String sessionId;
    /**
     * 改期总价
     */
    private String price;

    /**
     * 联系人信息
     */
    private Contact contact;

    /**
     * 使用渠道
     */
    private String sourceFrom;

    /**
     * 验证码，爬虫改期使用
     */
    private String verificationCode;
    /**
     * 是否确认航班保护标识
     * 空，非爬虫
     * true 选择保护
     * false 取消保护
     */
    private Boolean checkFlightProtection;

    public boolean valid() {
        return StringUtils.isAnyBlank(this.sessionId, this.price);
    }
}
