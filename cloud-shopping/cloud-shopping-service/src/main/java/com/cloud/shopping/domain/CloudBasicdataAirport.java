package com.cloud.shopping.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudBasicdataAirport {
    /**
    * id
    */
    private Integer id;

    /**
    * 机场三字码
    */
    private String code;

    /**
    * 城市三字码
    */
    private String citycode;

    /**
    * 国际民用航空组织机场四字码
    */
    private String icaocode;

    /**
    * 名称
    */
    private String name;

    /**
    * 全称
    */
    private String fullname;

    /**
    * 别名
    */
    private String alias;

    /**
    * 英文名称
    */
    private String enname;

    /**
    * 拼音
    */
    private String pinyin;

    /**
    * 拼音缩写
    */
    private String pinyinforshort;

    /**
    * 标准时差
    */
    private Short utcoffsethours;

    /**
    * 时区
    */
    private String timezone;

    /**
    * 经度
    */
    private String longitude;

    /**
    * 维度
    */
    private String latitude;

    /**
    * 海拔高度
    */
    private String altitude;

    /**
    * 机场类型
    */
    private Short type;

    /**
    * 机场等级
    */
    private String level;

    /**
    * 是否有效
    */
    private Short isuse;

    /**
    * 是否国内 1 国内 0国际
    */
    private Short iscivil;

    /**
    * 创建时间
    */
    private Date createtime;

    /**
    * 更新时间
    */
    private Date updatetime;

    private String iconurl;

    private String iconurl2;

    private String caac;
}