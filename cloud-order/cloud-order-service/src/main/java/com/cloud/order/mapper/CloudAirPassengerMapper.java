package com.cloud.order.mapper;

import com.cloud.order.repository.po.CloudAirPassenger;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirPassengerMapper {
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
    int insert(CloudAirPassenger record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudAirPassenger record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudAirPassenger selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudAirPassenger record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudAirPassenger record);
}