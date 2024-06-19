package com.rookie.bigdata.zto.service.impl;

import com.rookie.bigdata.zto.config.ZTOConfig;
import com.rookie.bigdata.zto.service.ZtoAfterSaleService;
import com.rookie.bigdata.zto.service.ZtoExpressService;
import com.rookie.bigdata.zto.util.HttpUtil;
import com.rookie.bigdata.zto.util.ZopDigestUtil;
import lombok.Getter;
import lombok.Setter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Class ZtoExpressServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/18 16:57
 * @Version 1.0
 */
public abstract class BaseZtoServiceImpl implements ZtoExpressService {

    final Logger log = LoggerFactory.getLogger(this.getClass());

    @Setter
    @Getter
    private ZtoAfterSaleService ztoAfterSaleService = new ZtoAfterSaleServiceImpl(this);

    private ZTOConfig config;

    @Override
    public String getZtoBaseUrl() {
        return this.getConfig().getZtoBaseUrl();
    }

    @Override
    public ZTOConfig getConfig() {
        return this.config;
    }

    @Override
    public void setConfig(ZTOConfig config) {
        this.config = config;
    }

    @Override
    public String postJson(String url, String jsonBody, Long timestamp) throws IOException {
        Map<String, String> headers = new HashMap<>();
        String strToDigest = jsonBody + this.config.getAppSecret();
        headers.put("x-companyid", this.config.getAppKey());
        headers.put("x-datadigest", ZopDigestUtil.digest(strToDigest, false, this.config.getEncryptionType(), timestamp, null));

        if (timestamp != null) {
            headers.put("x-timestamp", String.valueOf(timestamp));
        }
        return HttpUtil.postJson(url, headers, jsonBody);

    }
}
