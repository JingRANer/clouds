package com.cloud.shopping.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.cloud.shopping.domain.CloudCrawlerAirport;
import com.cloud.shopping.repository.mappers.CloudCrawlerAirportMapper;
@Service
public class CloudCrawlerAirportService{

    @Autowired
    private CloudCrawlerAirportMapper cloudCrawlerAirportMapper;

    
    public int deleteByPrimaryKey(Long id) {
        return cloudCrawlerAirportMapper.deleteByPrimaryKey(id);
    }

    
    public int insert(CloudCrawlerAirport record) {
        return cloudCrawlerAirportMapper.insert(record);
    }

    
    public int insertSelective(CloudCrawlerAirport record) {
        return cloudCrawlerAirportMapper.insertSelective(record);
    }

    
    public CloudCrawlerAirport selectByPrimaryKey(Long id) {
        return cloudCrawlerAirportMapper.selectByPrimaryKey(id);
    }

    
    public int updateByPrimaryKeySelective(CloudCrawlerAirport record) {
        return cloudCrawlerAirportMapper.updateByPrimaryKeySelective(record);
    }

    
    public int updateByPrimaryKey(CloudCrawlerAirport record) {
        return cloudCrawlerAirportMapper.updateByPrimaryKey(record);
    }

}
