package com.cloud.shopping.repository.domain;

import com.alibaba.fastjson.annotation.JSONField;
import com.cloud.shopping.dao.AirportCacheBean;
import lombok.Data;
import org.elasticsearch.common.geo.GeoPoint;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportPO
 * @create: 2024-12-21 17:43
 **/

@Data
public class AirportEsPO {

    private static final long serialVersionUID = 1664346695887534912L;

    private int airportId;
    private String id;

    private String iatacode;
    private String airportname;
    private String airportalias;
    private String airportenname;
    private String airportpinyin;
    private String airportpinyinshort;
    private String citycode;
    private String cityname;
    private String citypinyin;
    private String citypinyinshort;

    private String provincename;
    private String countryname;
    private String countrycode;

    private Boolean iscivil;
    private String countrypinyin;

    private String provincenamepinyin;

    private GeoPoint location;

    private String longitude;
    private String latitude;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AirportCacheBean that = (AirportCacheBean) o;

        if (iatacode != null ? !iatacode.equals(that.getIatacode()) : that.getIatacode() != null) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return iatacode != null ? iatacode.hashCode() : 0;
    }

}
