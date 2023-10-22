package com.cloud.register.builder;

import com.cloud.register.domain.CloudAirUser;
import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import com.cloud.register.domain.FrequentPassenger;
import com.cloud.register.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import java.util.Date;

@Mapper(imports = {Date.class})
public interface UserBuilder {

    UserBuilder INSTANCE = Mappers.getMapper(UserBuilder.class);

    User toUser(CloudAirUser cloudAirUser);

    FrequentPassenger toFrequentPassenger(CloudAirUserFrequentPassenger passenger);



    @Mapping(target = userId, constant = "11" )
    @Mapping(target = createTime, expression = "java(new Date())" )
    @Mapping(target = updateTime, expression = "java(new Date())" )
    @Mapping(target = age, source = "birthday", qualifiedByName = "caculateAge")
    @Mapping(target = type, source = "birthday", qualifiedByName = "caculateType")
    CloudAirUser toCloudAirUser(User user);

    CloudAirUserFrequentPassenger toCloudAirUserFrequentPassenger(FrequentPassenger frequentPassenger);
}
