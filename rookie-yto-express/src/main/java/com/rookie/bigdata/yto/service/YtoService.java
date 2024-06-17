package com.rookie.bigdata.yto.service;

import com.rookie.bigdata.yto.config.YTOConfig;

import java.io.IOException;

/**
 * @Class ZtoService
 * @Description
 * @Author rookie
 * @Date 2024/6/13 11:31
 * @Version 1.0
 */
public interface YtoService {

    /**
     * 圆通接口地址的域名.
     *
     * @return
     */
    String getYtoBaseUrl();


    /**
     * 获取配置.
     *
     * @return the config
     */
    YTOConfig getConfig();

    /**
     * 设置配置对象.
     *
     * @param config the config
     */
    void setConfig(YTOConfig config);


    String postJson(String url, String jsonBody) throws IOException;
}
