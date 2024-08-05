package com.cloud.order.mapper;

import com.cloud.order.domain.CloudAirOrder;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirOrderMapper {
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
    int insert(CloudAirOrder record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudAirOrder record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudAirOrder selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudAirOrder record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudAirOrder record);
}