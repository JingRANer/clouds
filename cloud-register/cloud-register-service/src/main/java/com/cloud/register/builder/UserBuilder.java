package com.cloud.register.builder;

import com.cloud.common.util.DateUtil;
import com.cloud.common.util.IdGenerator;
import com.cloud.register.domain.CloudAirUser;
import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import com.cloud.register.domain.FrequentPassenger;
import com.cloud.register.domain.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Named;
import org.mapstruct.factory.Mappers;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@Mapper(imports = {Date.class, IdGenerator.class, LocalDateTime.class})
public interface UserBuilder {
    UserBuilder INSTANCE = Mappers.getMapper(UserBuilder.class);

    User toUser(CloudAirUser cloudAirUser);

    FrequentPassenger toFrequentPassenger(CloudAirUserFrequentPassenger passenger);



    @Mapping(target = "userId", expression = "java(IdGenerator.generateId(IdGenerator.USER_TAG))" )
    @Mapping(target = "createTime", conditionExpression = "java(user.getCreateTime() != null)" )
    @Mapping(target = "updateTime", expression = "java(new Date())" )
    @Mapping(target = "age", source = "birthday", qualifiedByName = "caculateAge")
    CloudAirUser toCloudAirUser(User user);

    @Mapping(target = "userId", expression = "java(IdGenerator.generateId(IdGenerator.PSG_TAG))" )
    @Mapping(target = "createTime", conditionExpression = "java(frequentPassenger.getCreateTime() != null)" )
    @Mapping(target = "updateTime", expression = "java(new Date())" )
    @Mapping(target = "age", source = "birthday", qualifiedByName = "caculateAge")
    CloudAirUserFrequentPassenger toCloudAirUserFrequentPassenger(FrequentPassenger frequentPassenger);

    @Named("caculateAge")
    default int caculateAge(String birthDay) {
        Date birthDate;
        try {
            birthDate = new SimpleDateFormat(DateUtil.DATE_FORMAT).parse(birthDay);
        } catch (ParseException e) {
            return 0;
        }
        return DateUtil.getAgeByBirth(birthDate);
    }
}
