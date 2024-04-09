package com.cloud.shopping.dao;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

@Data
@Document(indexName = "rrr-sd")
public class Article {

    @Id
    @Field(index = false, type = FieldType.Integer)
    private Integer id;

    @Field(analyzer = "ik_smart",searchAnalyzer = "ik_smart",store = true,type = FieldType.Text)
    private String title;
    @Field(analyzer = "ik_smart",searchAnalyzer = "ik_smart",store = true,type = FieldType.Text)
    private String context;
    @Field(store = true,type = FieldType.Integer)
    private Integer hits;
}
