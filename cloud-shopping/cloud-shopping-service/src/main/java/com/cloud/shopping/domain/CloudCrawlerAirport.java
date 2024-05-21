package com.cloud.shopping.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CloudCrawlerAirport {
    /**
    * id
    */
    private Long id;

    private String source;

    private String iatacode;

    private String icaocode;

    private String airportname;

    private String airportalias;

    private String airportenname;

    private String airportpinyin;

    private String airportpinyinshort;

    private String citycode;

    private String cityname;

    private String cityenname;

    private String citypinyin;

    private String citypinyinshort;

    private String provincename;

    private String area;

    private String countryname;

    private String countrycode;

    private String regionname;

    private String dstarea;

    private String utcoffsethours;

    private String timezoneregionname;

    private String timezoneisuse;

    private String longitude;

    private String latitude;

    private String iscivil;

    private Integer auditstatus;

    private String iconurl;

    private String sort;

    private String passreason;

    /**
    * 机场类型
    */
    private String airporttype;

    /**
    * 机场管理机构名称
    */
    private String airportmanagename;

    /**
    * 所属省市
    */
    private String city;

    /**
    * 与城市关系
    */
    private String cityrelation;

    /**
    * 是否为特殊机场
    */
    private String boolspacilairp;

    /**
    * 机场性质
    */
    private String airportnature;

    /**
    * 机场用地
    */
    private String aitportland;

    /**
    * 机场标高
    */
    private String aitportelevation;

    /**
    * 基准温度
    */
    private String referencetemperature;

    /**
    * 消防保障等级
    */
    private String firelv;

    /**
    * 应急救护等级
    */
    private String rescuelv;

    /**
    * 助航灯光系统
    */
    private String lightsys;

    /**
    * 航站楼总建筑面积
    */
    private String floolarea;

    /**
    * 货运区面积
    */
    private String cargoarea;

    /**
    * 停车场面积
    */
    private String parkingarea;

    /**
    * 平滑数量
    */
    private String smoothnum;

    /**
    * 机位数
    */
    private String reservationnum;

    /**
    * 飞行区指标
    */
    private String airfieldindicator;

    /**
    * 飞行区面积
    */
    private String airfieldarea;

    /**
    * 跑道尺寸
    */
    private String runwaysize;

    /**
    * 跑道号码
    */
    private String runwaynum;

    /**
    * 跑道运行类别
    */
    private String runweycategory;

    /**
    * 跑道PCN
    */
    private String runpcn;

    /**
    * 跑道表面类型
    */
    private String runwaytype;

    /**
    * 可使用最大机型
    */
    private String mostmodel;

    /**
    * 2019年旅客吞吐量
    */
    private String travellernum;

    /**
    * 2019年货邮吞吐量
    */
    private String goodsnum;

    /**
    * 2019年起降架次
    */
    private String takeoffnum;

    /**
    * 机场平面图
    */
    private String airsrcurl;

    /**
    * 机场类/级别
    */
    private String airportlv;

    /**
    * 机场地址
    */
    private String address;

    /**
    * 基准点坐标
    */
    private String benchmarkxy;

    /**
    * 机场运营人名称
    */
    private String airoperatorname;

    /**
    * 机场所有人名称
    */
    private String airownername;

    /**
    * 跑道编号
    */
    private String runwaynumber;

    /**
    * 跑道长度
    */
    private String runwaylength;

    /**
    * 跑道宽度
    */
    private String runwaywidth;

    /**
    * 跑道坡度
    */
    private String runwayslope;

    /**
    * 表面类型
    */
    private String surfacetype;

    /**
    * 飞行规则
    */
    private String flightrule;

    /**
    * 飞行规则
    */
    private String flightrule1;

    /**
    * TLOF信息-机场标高
    */
    private String tlofhigh;

    /**
    * TLOF信息-尺寸（m
    */
    private String tlofsize;

    /**
    * TLOF信息-坡度
    */
    private String tlofslope;

    /**
    * TLOF信息-表面类型
    */
    private String tloffacetype;

    /**
    * FATO类型（跑道型/非跑道型）
    */
    private String fato;

    /**
    * 非跑道型FATO-尺寸（m）
    */
    private String nofatosize;

    /**
    * 非跑道型FATO-坡度
    */
    private String nofatoslope;

    /**
    * 非跑道型FATO-表面类型
    */
    private String nofatotype;

    /**
    * 跑道型-识别号码(无/有）
    */
    private String idennum;

    /**
    * 跑道型FATO-识别号码
    */
    private String fatoidennum;

    /**
    * 跑道型FATO-表面类型
    */
    private String fatotype;

    /**
    * 跑道型FATO-长度（m）
    */
    private String fatolength;

    /**
    * 跑道型FATO-宽度（m）
    */
    private String fatowidth;

    /**
    * 跑道型FATO-坡度
    */
    private String fatoslope;

    /**
    * 飞行规则
    */
    private String flightrule2;

    /**
    * 跑道编号
    */
    private String runwaynumber2;

    /**
    * 水文条件
    */
    private String hydrologic;

    /**
    * 基准温度
    */
    private String benchc;

    /**
    * 最大适用机型
    */
    private String biggestair;

    /**
    * 机场简介
    */
    private String context;

    /**
    * 机场图片
    */
    private String picture;

    private Date createtime;

    private Date updatetime;

    private String caac;

    private String name;

    private String altitude;

    private Short type;

    private String level;
}