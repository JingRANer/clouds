package com.cloud.shopping.builder;

import com.cloud.shopping.proxy.domain.request.ShoppingProxyReq;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

/**
 * @ClassName : ShoppingProxyBuilder
 * @Description :
 * @Author : jingran
 * @Date: 2023-10-25 10:13
 */
@Mapper
public interface ShoppingProxyBuilder {


    ShoppingProxyBuilder INSTANCE = Mappers.getMapper(ShoppingProxyBuilder.class);

    //机场建设费
    String AIRPORT = "CN";
    //燃油费
    String FUEL = "YQ";
    //成人
    String ADULT = "adult";
    //儿童
    String CHILD = "child";
    //婴儿
    String INFANT = "infant";
    //中转前段
    String FRONT = "1";
    //中转后段
    String AFTER = "2";
    //托运行李
    String BAGGAGE = "BAGGAGE_ALLOWANCE";
    //手提行李
    String BAGGAGE_CARRY_ON = "CARRY_ON_BAGGAGE_ALLOWANCE";
//
//    @Mapping(target = "channel", source = "source")
//    ShoppingReq toShoppingReq(ShoppingProxyReq shoppingProxyReq);

}
