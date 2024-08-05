package com.cloud.order.mapper;

import com.cloud.order.domain.CloudAirService;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirServiceMapper {
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
    int insert(CloudAirService record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudAirService record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudAirService selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudAirService record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudAirService record);
}