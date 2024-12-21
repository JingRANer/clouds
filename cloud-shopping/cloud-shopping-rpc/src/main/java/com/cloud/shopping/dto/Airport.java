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

    private String latitude;
    private String longtitue;
}
