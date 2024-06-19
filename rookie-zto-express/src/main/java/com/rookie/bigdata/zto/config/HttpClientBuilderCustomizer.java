package com.rookie.bigdata.zto.config;

import org.apache.http.impl.client.HttpClientBuilder;

/**
 * @Class HttpClientBuilderCustomizer
 * @Description
 * @Author rookie
 * @Date 2024/6/19 18:01
 * @Version 1.0
 */
@FunctionalInterface
public interface HttpClientBuilderCustomizer {
    void customize(HttpClientBuilder var1);
}
