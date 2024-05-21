package com.cloud.shopping.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudBasicdataAircity {
    /**
     * id
     */
    private Long id;

    /**
     * 城市三字码
     */
    private String code;

    /**
     * 名称
     */
    private String name;

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
     * 国家两字码
     */
    private String countrycode;

    /**
     * 省份
     */
    private String province;

    /**
     * 大区
     */
    private String area;

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
}