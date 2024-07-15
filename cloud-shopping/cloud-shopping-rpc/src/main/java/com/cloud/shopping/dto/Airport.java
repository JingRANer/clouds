package com.cloud.shopping.dto;

import com.alibaba.fastjson.annotation.JSONField;
import lombok.Data;

import java.util.Date;

/**
 * @author: jingran
 * @Desc:
 * @ClassName: Airport
 * @create: 2024-07-07 16:55
 **/

@Data
public class Airport {

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
}
