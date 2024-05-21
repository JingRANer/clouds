package com.cloud.shopping.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.shopping.repository.mappers.CloudBasicdataAirportMapper;
import com.cloud.shopping.domain.CloudBasicdataAirport;
@Service
public class CloudBasicdataAirportService{

    @Autowired
    private CloudBasicdataAirportMapper cloudBasicdataAirportMapper;

    
    public int deleteByPrimaryKey(Integer id) {
        return cloudBasicdataAirportMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(CloudBasicdataAirport record) {
        return cloudBasicdataAirportMapper.insert(record);
    }

    
    public int insertSelective(CloudBasicdataAirport record) {
        return cloudBasicdataAirportMapper.insertSelective(record);
    }

    
    public CloudBasicdataAirport selectByPrimaryKey(Integer id) {
        return cloudBasicdataAirportMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(CloudBasicdataAirport record) {
        return cloudBasicdataAirportMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(CloudBasicdataAirport record) {
        return cloudBasicdataAirportMapper.updateByPrimaryKey(record);
    }

}
