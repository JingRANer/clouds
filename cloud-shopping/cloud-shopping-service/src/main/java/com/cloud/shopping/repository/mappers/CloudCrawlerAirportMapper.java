package com.cloud.shopping.repository.mappers;

import com.cloud.shopping.domain.CloudCrawlerAirport;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CloudCrawlerAirportMapper {
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
    int insert(CloudCrawlerAirport record);

    /**
     * insert record to table selective
     * @param record the record
     * @return insert count
     */
    int insertSelective(CloudCrawlerAirport record);

    /**
     * select by primary key
     * @param id primary key
     * @return object by primary key
     */
    List<CloudCrawlerAirport> selectByIsCivil(String iscivil);

    /**
     * update record selective
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKeySelective(CloudCrawlerAirport record);

    /**
     * update record
     * @param record the updated record
     * @return update count
     */
    int updateByPrimaryKey(CloudCrawlerAirport record);
}