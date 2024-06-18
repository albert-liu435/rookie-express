package com.rookie.bigdata.zto.config;

import com.rookie.bigdata.zto.enums.EncryptionType;
import lombok.Data;

/**
 * @Class ZTOConfig
 * @Description 中通快递配置
 * @Author rookie
 * @Date 2024/6/13 11:22
 * @Version 1.0
 */

@Data
public class ZTOConfig {

    private static final String DEFAULT_ZTO_PRO_BASE_URL = "https://japi-test.zto.com";

    private static final String DEFAULT_ZTO_UAT_BASE_URL = "https://japi.zto.com";


    private String appKey;
    private String appSecret;

    /**
     * 微信支付接口请求地址域名部分.
     */
    private String ztoBaseUrl = DEFAULT_ZTO_PRO_BASE_URL;


    /**
     * 返回所设置的中通接口的域名
     *
     * @return 中通接口地址的域名
     */
    public String getZtoBaseUrl() {

        if (this.useSandboxEnv) {
            return DEFAULT_ZTO_UAT_BASE_URL;
        }
        return DEFAULT_ZTO_PRO_BASE_URL;
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
