package com.cloud.register.mappers;

import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CloudAirUserFrequentPassengerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudAirUserFrequentPassenger record);

    int insertSelective(CloudAirUserFrequentPassenger record);

    CloudAirUserFrequentPassenger selectByPrimaryKey(Long id);
    List<CloudAirUserFrequentPassenger> selectByUserId(String userId);

    int updateByPrimaryKeySelective(CloudAirUserFrequentPassenger record);

    int updateByPrimaryKey(CloudAirUserFrequentPassenger record);
}