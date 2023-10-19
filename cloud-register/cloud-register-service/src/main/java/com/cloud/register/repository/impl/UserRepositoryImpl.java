package com.cloud.register.repository.impl;

import com.cloud.common.SingleResponse;
import com.cloud.register.builder.UserBuilder;
import com.cloud.register.domain.CloudAirUser;
import com.cloud.register.domain.CloudAirUserFrequentPassenger;
import com.cloud.register.domain.FrequentPassenger;
import com.cloud.register.domain.User;
import com.cloud.register.repository.UserRepository;
import com.cloud.register.repository.mappers.CloudAirUserFrequentPassengerMapper;
import com.cloud.register.repository.mappers.CloudAirUserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserRepositoryImpl implements UserRepository {
    // todo 一致性问题
    @Resource
    CloudAirUserFrequentPassengerMapper frequentPassengerMapper;

    @Resource
    CloudAirUserMapper userMapper;


    static final UserBuilder userBuilder = UserBuilder.INSTANCE;

    @Override
    public User selectByMobile(String mobile) {
        CloudAirUser cloudAirUser = userMapper.selectByMobile(mobile);
        if(cloudAirUser == null) {
            return null;
        }
        User user = userBuilder.toUser(cloudAirUser);
        List<CloudAirUserFrequentPassenger> cloudAirUserFrequentPassengers = frequentPassengerMapper.selectByUserId(cloudAirUser.getUserId());
        List<FrequentPassenger> frequentPassengers = cloudAirUserFrequentPassengers.stream().map(userBuilder::toFrequentPassenger).collect(Collectors.toList());
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
        if(savedCloudAirUser != null) {
            CloudAirUser cloudAirUser = userBuilder.toCloudAirUser(user);
            int i = userMapper.insertSelective(cloudAirUser);
            if(i>0) {
                user.getFrequentPassengers().forEach(frequentPassenger -> {
                    CloudAirUserFrequentPassenger passenger = userBuilder.toCloudAirUserFrequentPassenger(frequentPassenger);
                    frequentPassengerMapper.insertSelective(passenger);
                });
            }
        } else {
            List<CloudAirUserFrequentPassenger> passengers = frequentPassengerMapper.selectByUserId(user.getUserId());
            List<String> newPsgIdList = user.getFrequentPassengers().stream().map(FrequentPassenger::getPassengerId).collect(Collectors.toList());
            for (CloudAirUserFrequentPassenger passenger : passengers) {
                if(newPsgIdList.contains(passenger.getPassengerId())) {
                    frequentPassengerMapper.updateByPrimaryKeySelective(passenger);
                } else {
                    frequentPassengerMapper.deleteByPrimaryKey(passenger.getId());
                }
            }

            List<String> savedPsgIdList = passengers.stream().map(CloudAirUserFrequentPassenger::getPassengerId).collect(Collectors.toList());

        }

    }
}
