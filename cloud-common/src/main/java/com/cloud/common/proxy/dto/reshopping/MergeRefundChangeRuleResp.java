package com.cloud.common.proxy.dto.reshopping;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author jingran
 */
@Data
public class MergeRefundChangeRuleResp implements Serializable {
    private static final long serialVersionUID = -9162599970138254351L;
    /**
     * 航司二字码
     *
     * @mock HU
     */
    private String airline;

    /**
     * 当前舱位
     *
     * @mock Q
     */
    private String cabin;
    /**
     * 航司个性化或者通用化描述内容
     *
     * @mock 航司针对退改签的描述
     */
    private String rcDesc;

    /**
     * 底部的个性化描述
     *
     * @mock 航司底部针对退改签的描述
     */
    private String bottomDesc;

    /**
     * 飞行方向，标识去程和返程用，原样返回
     * G去程，  B返程
     *
     * @mock G
     */
    private String flightDirection;


    /**
     * 存放退的详细规则
     *
     * @mock list集合，按照顺序 存放退订收费规则
     */
    private List<RefundChangeDetail> rList;
    /**
     * 存放改的详细规则
     *
     * @mock list集合，按照顺序 存放同舱改期收费规则
     */
    private List<RefundChangeDetail> cList;

    /**
     * pageid
     */
    private String targetPageId;
    /**
     * 拼接跳转参数
     */
    private String parameter;
    /**
     * 跳转描述
     */

    private String oriDesc;
    /**
     * 舱位产品 COMMONY
     */

    private String cabinProduct;
    /**
     * 北京-上海 航班号
     */

    private String flightDesc;

    /**
     * 航班号
     */
    private String flightNo;

    /**
     * 航班日期
     */
    private String flightDate;

    /**
     * 出发地三字码
     */
    private String deptCode;

    /**
     * 到达地三字码
     */
    private String destCode;

    /**
     * 针对多段航班只存在一个退改签规则，保持数据按照渠道提供的原有信息存储。
     * 在展示层要多多段分开展示，所以增加一个航班集合属性，方便前端展示使用
     */
    private List<MergeRefundChangeFlight> refundChangeFlightList;
}
