package com.cloud.order.mapper;

import com.cloud.order.domain.CloudAirSegment;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CloudAirSegmentMapper {
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
    int insert(CloudAirSegment record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudAirSegment record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    CloudAirSegment selectByPrimaryKey(Long id);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudAirSegment record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudAirSegment record);
}