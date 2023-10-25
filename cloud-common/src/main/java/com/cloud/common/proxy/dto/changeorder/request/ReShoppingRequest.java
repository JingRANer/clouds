package com.cloud.common.proxy.dto.changeorder.request;

import com.umetrip.air.order.service.dto.changeorder.SearchDate;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.io.Serializable;
import java.util.List;

/**
 * @author zcy
 * @Date 2022-04-01
 */
@Data
public class ReShoppingRequest implements Serializable {

    private static final long serialVersionUID = 1208774531293456085L;
    /**
     * 缓存的key值
     */
    private String sessionId;

    /**
     * userId
     * 未用到
     */
    private String userId;

    /**
     * 改期类型
     * 0 - 自愿
     * 1 - 非自愿
     */
    private String changeType;

    /**
     * 改期原因
     */
    private String changeReason;

    /**
     * 非自愿改期时，旅客上传的证明材料文件
     */
    private List<String> fileList;

    /**
     * 改期航班日期
     */
    private SearchDate searchDate;

    /**
     * 是否同意航变保护
     */
    private Boolean checkFlightProtection;

    /**
     * 短信验证码
     */
    private String verificationCode;

    /**
     * 图片验证码
     */
    private String imgVerificationCode;


    /**
     * reShopping参数校验是否通过
     **/
    public boolean valid() {
        if (StringUtils.isAnyBlank(sessionId, changeType) || null == searchDate) {
            return false;
        }
        return true;
    }
}
