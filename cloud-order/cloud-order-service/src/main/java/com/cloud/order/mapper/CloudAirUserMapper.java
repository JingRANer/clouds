package com.cloud.order.mapper;

import com.cloud.order.domain.CloudAirUser;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirUserMapper {
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
    int insert(CloudAirUser record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudAirUser record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudAirUser selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudAirUser record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudAirUser record);
}