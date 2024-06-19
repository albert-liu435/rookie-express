package com.rookie.bigdata.zto.service;

import com.rookie.bigdata.zto.config.ZTOConfig;

import java.io.IOException;

/**
 * @Class ZtoService
 * @Description
 * @Author rookie
 * @Date 2024/6/13 11:31
 * @Version 1.0
 */
public interface ZtoService {

    /**
     * 中通接口地址的域名.
     *
     * @return
     */
    String getZtoBaseUrl();


    /**
     * 获取配置.
     *
     * @return the config
     */
    ZTOConfig getConfig();

    /**
     * 设置配置对象.
     *
     * @param config the config
     */
    void setConfig(ZTOConfig config);


    String postJson(String url, String jsonBody, Long timestamp) throws IOException;

    /**
     * 中通售后服务
     *
     * @return
     */
    ZtoAfterSaleService getZtoAfterSaleService();
}
