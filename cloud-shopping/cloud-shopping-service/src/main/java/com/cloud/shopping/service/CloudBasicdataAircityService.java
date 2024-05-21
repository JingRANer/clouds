package com.cloud.shopping.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.shopping.domain.CloudBasicdataAircity;
import com.cloud.shopping.repository.mappers.CloudBasicdataAircityMapper;
@Service
public class CloudBasicdataAircityService{

    @Autowired
    private CloudBasicdataAircityMapper cloudBasicdataAircityMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return cloudBasicdataAircityMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(CloudBasicdataAircity record) {
        return cloudBasicdataAircityMapper.insert(record);
    }

    
    public int insertSelective(CloudBasicdataAircity record) {
        return cloudBasicdataAircityMapper.insertSelective(record);
    }

    
    public CloudBasicdataAircity selectByPrimaryKey(Long id) {
        return cloudBasicdataAircityMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(CloudBasicdataAircity record) {
        return cloudBasicdataAircityMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(CloudBasicdataAircity record) {
        return cloudBasicdataAircityMapper.updateByPrimaryKey(record);
    }

}
