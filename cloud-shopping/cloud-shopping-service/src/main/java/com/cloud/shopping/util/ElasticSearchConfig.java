package com.cloud.shopping.util;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.http.HttpHost;
import org.apache.http.auth.AuthScope;
import org.apache.http.auth.UsernamePasswordCredentials;
import org.apache.http.client.CredentialsProvider;
import org.apache.http.impl.client.BasicCredentialsProvider;
import org.elasticsearch.client.RestClient;
import org.elasticsearch.client.RestClientBuilder;
import org.elasticsearch.client.RestHighLevelClient;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * restHighLevelClient 客户端配置类
 *
 */
@Slf4j
@Data
@Configuration
@ConfigurationProperties(prefix = "spring.elasticsearch.rest")
public class ElasticsearchConfig {

    /**
     * es host ip 地址（集群）
     */
    private String uris;
    /**
     * es用户名
     */
    private String userName;
    /**
     * es密码
     */
    private String password;
    /**
     * es 请求方式
     */
    private String scheme;
    /**
     * es 连接超时时间
     */
    private int connectTimeOut;
    /**
     * es socket 连接超时时间
     */
    private int socketTimeOut;
    /**
     * es 请求超时时间
     */
    private int connectionRequestTimeOut;
    /**
     * es 最大连接数
     */
    private int maxConnectNum;
    /**
     * es 每个路由的最大连接数
     */
    private int maxConnectNumPerRoute;


    /**
     * 如果@Bean没有指定bean的名称，那么方法名就是bean的名称
     */
    @Bean(name = "restHighLevelClient")
    public RestHighLevelClient restHighLevelClient() {
        // 构建连接对象
        RestClientBuilder builder = RestClient.builder(getEsHost());

        // 连接延时配置
        builder.setRequestConfigCallback(requestConfigBuilder -> {
            requestConfigBuilder.setConnectTimeout(connectTimeOut);
            requestConfigBuilder.setSocketTimeout(socketTimeOut);
            requestConfigBuilder.setConnectionRequestTimeout(connectionRequestTimeOut);
            return requestConfigBuilder;
        });

        // 连接数配置
        builder.setHttpClientConfigCallback(httpClientBuilder -> {
            httpClientBuilder.setMaxConnTotal(maxConnectNum);
            httpClientBuilder.setMaxConnPerRoute(maxConnectNumPerRoute);
            httpClientBuilder.setDefaultCredentialsProvider(getCredentialsProvider());
            return httpClientBuilder;
        });

        return new RestHighLevelClient(builder);
    }

    private HttpHost[] getEsHost() {
        // 拆分地址（es为多节点时，不同host以逗号间隔）
        List<HttpHost> hostLists = new ArrayList<>();
        String[] hostList = uris.split(",");
        for (String addr : hostList) {
            String host = addr.split(":")[0];
            String port = addr.split(":")[1];
            hostLists.add(new HttpHost(host, Integer.parseInt(port), scheme));
        }
        // 转换成 HttpHost 数组
        return hostLists.toArray(new HttpHost[]{});
    }

    private CredentialsProvider getCredentialsProvider() {
        // 设置用户名、密码
        CredentialsProvider credentialsProvider = new BasicCredentialsProvider();
        credentialsProvider.setCredentials(AuthScope.ANY, new UsernamePasswordCredentials(userName, password));
        return credentialsProvider;
    }
}