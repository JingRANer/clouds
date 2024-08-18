package com.cloud.register.mappers;

import com.cloud.register.domain.CloudAirUser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface CloudAirUserMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CloudAirUser record);

    int insertSelective(CloudAirUser record);

    CloudAirUser selectByPrimaryKey(Long id);
    CloudAirUser selectByUserId(String userId);
    CloudAirUser selectByMobile(String mobile);
    CloudAirUser selectByMobileAndName(@Param("mobile") String mobile, @Param("name") String name);

    int updateByPrimaryKeySelective(CloudAirUser record);

    int updateByPrimaryKey(CloudAirUser record);
}