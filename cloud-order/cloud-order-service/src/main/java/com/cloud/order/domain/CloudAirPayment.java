package com.cloud.order.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudAirPayment implements Serializable {
    /**
    * ä¸»é”®
    */
    private Long id;

    /**
    * æœ¬æ¬¡æ”¯ä»˜id
    */
    private String paymentId;

    /**
    * æ”¯ä»˜ç±»åž‹ 0ï¼šæ”¯ä»˜ï¼Œ1ï¼šé€€æ¬¾
    */
    private String type;

    /**
    * æ”¯ä»˜ç±»åž‹ 301 æ”¯ä»˜å® 302å¾®ä¿¡
    */
    private Integer pluginId;

    /**
    * æ”¯ä»˜æµæ°´å·/é€€æ¬¾æµæ°´å·
    */
    private String serialNumber;

    private String tenantOrderId;

    /**
    * èˆªæ—…æ”¯ä»˜å•†æˆ·å·
    */
    private String accountId;

    /**
    * èˆªå¸å®‰æ…°æ€§æ”¯ä»˜æ ¡éªŒå­—æ®µ
    */
    private String airlinePayId;

    /**
    * æ”¯ä»˜é‡‘é¢
    */
    private BigDecimal amount;

    private Date createTime;

    /**
    * ç¡®è®¤æ”¯ä»˜æ—¶é—´
    */
    private Date confirmTime;

    /**
    * æ”¯ä»˜çŠ¶æ€ï¼Œ0 æœªæ”¯ä»˜ï¼Œ1å·²æ”¯ä»˜ï¼Œ2æ”¯ä»˜ç¡®è®¤ä¸­,3 æ”¯ä»˜å¤±è´¥
    */
    private String status;

    /**
    * è¯·æ±‚æ”¯ä»˜ä¿¡æ¯ä¸²
    */
    private String sign;

    /**
    * èˆªæ—…è®¢å•å·
    */
    private String orderno;

    /**
    * é€€æ¬¾æ—¶è®°å½•åŽŸé€€æ¬¾ID
    */
    private String oriPaymentId;

    /**
    * é”™è¯¯ç 
    */
    private Integer errCode;

    /**
    * é”™è¯¯ä¿¡æ¯
    */
    private String errMsg;

    /**
    * å®žé™…æ”¯ä»˜é‡‘é¢/å®žé™…é€€è¿˜é‡‘é¢
    */
    private BigDecimal actualAmount;

    /**
    * æ¶ˆè´¹æ–¹å¼ï¼ˆ0 çŽ°é‡‘ 1 åˆ¸ 2 ç§¯åˆ†ï¼‰
    */
    private String payType;

    /**
    * ç”¨æˆ·ID
    */
    private String userId;

    private static final long serialVersionUID = 1L;
}