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
public class AirportPO {

    private static final long serialVersionUID = 1664346695887534912L;

    private int airportId;
    private String id;

    @JSONField(name = "iata_code")
    private String iatacode;
    @JSONField(name = "iata_name")
    private String airportname;
    @JSONField(name = "airport_alias")
    private String airportalias;
    @JSONField(name = "iata_full_name")
    private String airportenname;
    @JSONField(name = "iata_pinyin")
    private String airportpinyin;
    @JSONField(name = "iata_pinyin_short")
    private String airportpinyinshort;
    @JSONField(name = "city_code")
    private String citycode;
    @JSONField(name = "city_name")
    private String cityname;
    @JSONField(name = "city_pinyin")
    private String citypinyin;
    @JSONField(name = "city_pinyin_short")
    private String citypinyinshort;

    private String provincename;
    @JSONField(name = "country_name")
    private String countryname;
    @JSONField(name = "country_code")
    private String countrycode;

    private Boolean iscivil;
    @JSONField(name = "country_pinyin")
    private String countrypinyin;

    @JSONField(name = "provincename_pinyin")
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
