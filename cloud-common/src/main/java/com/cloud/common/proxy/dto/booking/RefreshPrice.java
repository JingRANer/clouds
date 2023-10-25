package com.cloud.common.proxy.dto.booking;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author lyxbai
 */
@Data
public class RefreshPrice implements Serializable {

    private static final long serialVersionUID = -1225247460874900510L;

    public RefreshPrice(){}

    public RefreshPrice(Integer adultTktPrice,Integer childTktPrice,
                        Integer infantTktPrice,Integer adultTaxPrice,
                        Integer childTaxPrice,Integer infantTaxPrice){
        this.setAdultTktPrice(adultTktPrice);
        this.setChildTktPrice(childTktPrice);
        this.setInfantTktPrice(infantTktPrice);
        this.setAdultTaxPrice(adultTaxPrice);
        this.setChildTaxPrice(childTaxPrice);
        this.setInfantTaxPrice(infantTaxPrice);
    }

    /**
     * 成人票价(元)
     */
    private Integer adultTktPrice;

    /**
     * 儿童票价(元)
     */
    private Integer childTktPrice;

    /**
     * 婴儿票价(元)
     */
    private Integer infantTktPrice;

    /**
     * 成人税费(元)
     */
    private Integer adultTaxPrice;

    /**
     * 儿童税费(元)
     */
    private Integer childTaxPrice;

    /**
     * 婴儿税费(元)
     */
    private Integer infantTaxPrice;

    /**
     * proxy刷新价格
     */
    private List<RefreshPriceByProxy> refreshOrderPrice;
}

