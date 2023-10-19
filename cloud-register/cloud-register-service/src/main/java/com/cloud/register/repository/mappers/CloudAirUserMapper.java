package com.cloud.register.repository.mappers;

import com.cloud.register.domain.CloudAirUser;

public interface CloudAirUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudAirUser record);

    int insertSelective(CloudAirUser record);

    CloudAirUser selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CloudAirUser record);

    int updateByPrimaryKey(CloudAirUser record);
}