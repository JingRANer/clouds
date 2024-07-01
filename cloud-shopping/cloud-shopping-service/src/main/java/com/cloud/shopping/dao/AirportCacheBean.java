package com.cloud.shopping.dao;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;
import org.apache.commons.lang.StringUtils;
import org.springframework.data.elasticsearch.annotations.Document;

import java.io.Serializable;
import java.util.Date;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: AirportCacheBean
 * @create: 2024-05-19 18:02
 **/

@Data
public class AirportCacheBean implements Comparable<AirportCacheBean>, Serializable {

    private static final long serialVersionUID = 1664346695887534912L;
    private Integer id;

    @JSONField(name = "IATA_CODE")
    private String iatacode;
    @JSONField(name = "ICAOCODE")
    private String icaocode;
    @JSONField(name = "AIRPORT_NAME")
    private String airportname;
    @JSONField(name = "AIRPORT_ALIAS")
    private String airportalias;
    @JSONField(name = "AIRPORTENNAME")
    private String airportenname;
    @JSONField(name = "AIRPORT_PINYIN")
    private String airportpinyin;
    @JSONField(name = "AIRPORTPINYINSHORT")
    private String airportpinyinshort;
    @JSONField(name = "CITYCODE")
    private String citycode;
    @JSONField(name = "CITYNAME")
    private String cityname;
    @JSONField(name = "CITYENNAME")
    private String cityenname;
    @JSONField(name = "CITYPINYIN")
    private String citypinyin;
    @JSONField(name = "CITYPINYINSHORT")
    private String citypinyinshort;
    @JSONField(name = "PROVINCENAME")
    private String provincename;
    @JSONField(name = "AREA")
    private String area;
    @JSONField(name = "COUNTRYNAME")
    private String countryname;
    @JSONField(name = "COUNTRYCODE")
    private String countrycode;
    @JSONField(name = "REGIONNAME")
    private String regionname;
    @JSONField(name = "DSTAREA")
    private String dstarea;
    @JSONField(name = "UTCOFFSETHOURS")
    private String utcoffsethours;
    @JSONField(name = "TIMEZONEREGIONNAME")
    private String timezoneregionname;
    @JSONField(name = "TIMEZONEISUSE")
    private String timezoneisuse;
    @JSONField(name = "LONGITUDE")
    private String longitude;
    @JSONField(name = "LATITUDE")
    private String latitude;
    @JSONField(name = "ISCIVIL")
    private Boolean iscivil;
    @JSONField(name = "ISUSE")
    private Short isuse;
    @JSONField(name = "ICONURL")
    private String iconurl;
    @JSONField(name = "SORT")
    private String sort;
    @JSONField(name = "MODIFYTIME")
    private Date modifytime;
    @JSONField(name = "CREATETIME")
    private Date createtime;

    @JSONField(name = "ICONURL2")
    private String iconurl2;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        AirportCacheBean that = (AirportCacheBean) o;

        if (iatacode != null ? !iatacode.equals(that.iatacode) : that.iatacode != null) {
            return false;
        }
        return sort != null ? sort.equals(that.sort) : that.sort == null;

    }

    @Override
    public int hashCode() {
        int result = iatacode != null ? iatacode.hashCode() : 0;
        result = 31 * result + (sort != null ? sort.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(AirportCacheBean o) {
        if (StringUtils.isNotBlank(this.sort)) {
            if (StringUtils.isNotBlank(o.sort)) {
                if (Integer.parseInt(this.sort) > Integer.parseInt(o.sort)) {
                    return 1;
                } else if (Integer.parseInt(this.sort) < Integer.parseInt(o.sort)) {
                    return -1;
                } else {
                    return 0;
                }
            } else {//将null放在后面
                return -1;
            }
        } else {
            if (StringUtils.isBlank(o.sort)) {
                return 0;
            } else {
                return 1;
            }
        }
    }
}
