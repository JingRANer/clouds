package com.cloud.register.repository.impl;

import com.cloud.common.CloudErrorEnum;
import com.cloud.common.SingleResponse;
import com.cloud.register.builder.UserBuilder;
import com.cloud.register.domain.CloudAirUser;
import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import com.cloud.register.domain.FrequentPassenger;
import com.cloud.register.domain.User;
import com.cloud.register.repository.UserRepository;
import com.cloud.register.mappers.CloudAirUserFrequentPassengerMapper;
import com.cloud.register.mappers.CloudAirUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author JingRAN
 */
@Service("userRepository")
public class UserRepositoryImpl implements UserRepository {
    // todo 一致性问题

    @Resource
    CloudAirUserFrequentPassengerMapper frequentPassengerMapper;


    @Resource
    CloudAirUserMapper userMapper;


    final UserBuilder USER_BUILDER = UserBuilder.INSTANCE;

    @Override
    public User selectByMobile(String mobile) {
        CloudAirUser cloudAirUser = userMapper.selectByMobile(mobile);
        if (cloudAirUser == null) {
            return null;
        }
        User user = USER_BUILDER.toUser(cloudAirUser);
        List<CloudAirUserFrequentPassenger> cloudAirUserFrequentPassengers = frequentPassengerMapper.selectByUserId(cloudAirUser.getUserId());
        List<FrequentPassenger> frequentPassengers = cloudAirUserFrequentPassengers.stream().map(USER_BUILDER::toFrequentPassenger).collect(Collectors.toList());
        user.setFrequentPassengers(frequentPassengers);
        return user;
    }

    @Override
    public User selectByUserId(String userId) {
        return null;
    }

    @Override
    public SingleResponse update(User user) {
        return null;
    }

    @Override
    public SingleResponse save(User user) {

        CloudAirUser savedCloudAirUser = userMapper.selectByUserId(user.getUserId());
        int saveCode;
        if (savedCloudAirUser == null) {
            CloudAirUser cloudAirUser = USER_BUILDER.toCloudAirUser(user);
            saveCode = userMapper.insertSelective(cloudAirUser);
            if (saveCode > 0) {
                user.getFrequentPassengers().forEach(frequentPassenger -> {
                    CloudAirUserFrequentPassenger passenger = USER_BUILDER.toCloudAirUserFrequentPassenger(frequentPassenger);
                    frequentPassengerMapper.insertSelective(passenger);
                });
            } else {
                return SingleResponse.buildFailure(CloudErrorEnum.SING_UP_WRONG);
            }
        } else {
            userMapper.updateByPrimaryKeySelective(USER_BUILDER.toCloudAirUser(user));
            List<CloudAirUserFrequentPassenger> passengers = frequentPassengerMapper.selectByUserId(user.getUserId());
            List<String> newPsgIdList = user.getFrequentPassengers().stream().map(FrequentPassenger::getPassengerId).collect(Collectors.toList());
            for (CloudAirUserFrequentPassenger passenger : passengers) {
                if (newPsgIdList.contains(passenger.getPassengerId())) {
                    saveCode = frequentPassengerMapper.updateByPrimaryKeySelective(passenger);
                } else {
                    saveCode = frequentPassengerMapper.deleteByPrimaryKey(passenger.getId());
                }
                if (saveCode <= 0) {
                    return SingleResponse.buildFailure(CloudErrorEnum.ADD_FREQUENT_PSG_WRONG);
                }
            }

            List<String> savedPsgIdList = passengers.stream().map(CloudAirUserFrequentPassenger::getPassengerId).collect(Collectors.toList());

            for (FrequentPassenger frequentPassenger : user.getFrequentPassengers()) {
                if (!savedPsgIdList.contains(frequentPassenger.getPassengerId())) {

                    saveCode = frequentPassengerMapper.insertSelective(USER_BUILDER.toCloudAirUserFrequentPassenger((frequentPassenger)));
                    if (saveCode <= 0) {
                        return SingleResponse.buildFailure(CloudErrorEnum.ADD_FREQUENT_PSG_WRONG);
                    }
                }
            }

        }
        return SingleResponse.buildSuccess();

    }
}
