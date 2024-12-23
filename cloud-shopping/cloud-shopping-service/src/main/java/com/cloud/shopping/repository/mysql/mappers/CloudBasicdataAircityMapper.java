package com.cloud.shopping.repository.mysql.mappers;

import com.cloud.shopping.domain.CloudBasicdataAircity;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudBasicdataAircityMapper {
    /**
     * delete by primary key
     * @param id primaryKey
     * @return deleteCount
     */
    int deleteByPrimaryKey(Long id);

    /**
     * insert record to table
     * @param record the record
     * @return insert count
     */
    int insert(CloudBasicdataAircity record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudBasicdataAircity record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudBasicdataAircity selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudBasicdataAircity record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudBasicdataAircity record);
}