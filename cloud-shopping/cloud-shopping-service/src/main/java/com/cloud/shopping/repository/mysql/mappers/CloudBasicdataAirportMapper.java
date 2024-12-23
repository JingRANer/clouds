package com.cloud.shopping.repository.mysql.mappers;

import com.cloud.shopping.domain.CloudBasicdataAirport;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudBasicdataAirportMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CloudBasicdataAirport record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudBasicdataAirport record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudBasicdataAirport selectByPrimaryKey(Integer id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudBasicdataAirport record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudBasicdataAirport record);
}