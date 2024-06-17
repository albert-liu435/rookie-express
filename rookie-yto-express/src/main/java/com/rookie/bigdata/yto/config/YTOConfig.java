package com.rookie.bigdata.yto.config;

import com.rookie.bigdata.yto.enums.EncryptionType;
import lombok.Data;

/**
 * @Class ZTOConfig
 * @Description 中通快递配置
 * @Author rookie
 * @Date 2024/6/13 11:22
 * @Version 1.0
 */

@Data
public class YTOConfig {

    private static final String DEFAULT_YTO_PRO_BASE_URL = "https://api.mch.weixin.qq.com";

    private static final String DEFAULT_YTO_UAT_BASE_URL = "https://openuat.yto56test.com:6443";


    private String appKey;
    private String appSecret;

    private String urlKey;

    /**
     * 微信支付接口请求地址域名部分.
     */
    private String ztoBaseUrl = DEFAULT_YTO_PRO_BASE_URL;


    /**
     * 返回所设置的中通接口的域名
     *
     * @return 中通接口地址的域名
     */
    public String getYtoBaseUrl() {

        if (this.useSandboxEnv) {
            return DEFAULT_YTO_UAT_BASE_URL;
        }
        return DEFAULT_YTO_PRO_BASE_URL;
    }

    /**
     * 是否使用UAT环境
     * 默认不使用
     */
    private boolean useSandboxEnv = false;


    /**
     * 默认使用MD5
     */
    private String encryptionType = EncryptionType.MD5.getCode();


}
