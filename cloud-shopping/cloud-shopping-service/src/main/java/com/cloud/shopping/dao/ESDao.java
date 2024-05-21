package com.cloud.shopping.dao;
import org.springframework.data.domain.Pageable;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ESDao extends ElasticsearchRepository<Article,Integer>  {
    /**
     * 根据标题查询
     * @param title
     * @return
     */
    List<AirportCacheBean> findByTitle(String title);

    /**
     * 根据标题或内容查询
     * @param title
     * @param context
     * @return
     */
    List<AirportCacheBean> findByTitleOrContext(String title,String context);

    /**
     * 根据标题或内容查询（含分页）
     * @param title
     * @param context
     * @param pageable
     * @return
     */
    List<AirportCacheBean> findByTitleOrContext(String title, String context, Pageable pageable);
}
