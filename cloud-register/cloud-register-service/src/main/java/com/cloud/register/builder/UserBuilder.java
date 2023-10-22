package com.cloud.register.builder;

import com.cloud.register.domain.CloudAirUser;
import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import com.cloud.register.domain.FrequentPassenger;
import com.cloud.register.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserBuilder {

    UserBuilder INSTANCE = Mappers.getMapper(UserBuilder.class);

    User toUser(CloudAirUser cloudAirUser);

    FrequentPassenger toFrequentPassenger(CloudAirUserFrequentPassenger passenger);

    CloudAirUser toCloudAirUser(User user);

    CloudAirUserFrequentPassenger toCloudAirUserFrequentPassenger(FrequentPassenger frequentPassenger);
}
