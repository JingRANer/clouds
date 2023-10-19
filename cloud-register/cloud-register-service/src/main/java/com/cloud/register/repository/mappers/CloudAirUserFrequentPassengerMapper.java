package com.cloud.register.repository.mappers;

import com.cloud.register.domain.CloudAirUserFrequentPassenger;

public interface CloudAirUserFrequentPassengerMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudAirUserFrequentPassenger record);

    int insertSelective(CloudAirUserFrequentPassenger record);

    CloudAirUserFrequentPassenger selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudAirUserFrequentPassenger record);

    int updateByPrimaryKey(CloudAirUserFrequentPassenger record);
}