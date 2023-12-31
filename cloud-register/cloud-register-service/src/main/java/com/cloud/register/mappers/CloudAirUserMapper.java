package com.cloud.register.mappers;

import com.cloud.register.domain.CloudAirUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudAirUser record);

    int insertSelective(CloudAirUser record);

    CloudAirUser selectByPrimaryKey(Long id);
    CloudAirUser selectByUserId(String userId);
    CloudAirUser selectByMobile(String mobile);

    int updateByPrimaryKeySelective(CloudAirUser record);

    int updateByPrimaryKey(CloudAirUser record);
}