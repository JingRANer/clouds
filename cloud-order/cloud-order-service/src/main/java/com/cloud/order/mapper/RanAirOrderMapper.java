package com.cloud.order.mapper;

import com.cloud.order.domain.RanAirOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface RanAirOrderMapper {
    int deleteByPrimaryKey(Long id);

    int insert(RanAirOrder record);

    int insertSelective(RanAirOrder record);

    RanAirOrder selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(RanAirOrder record);

    int updateByPrimaryKey(RanAirOrder record);
}