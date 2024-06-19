package com.rookie.bigdata.common.util.http;

/**
 * @Class RequestHttp
 * @Description
 * @Author rookie
 * @Date 2024/6/19 16:04
 * @Version 1.0
 */
public interface RequestHttp<H, P> {

    /**
     * 返回httpClient.
     *
     * @return 返回httpClient
     */
    H getRequestHttpClient();

    /**
     * 返回httpProxy.
     *
     * @return 返回httpProxy
     */
    P getRequestHttpProxy();

    /**
     * 返回HttpType.
     *
     * @return HttpType
     */
    HttpType getRequestType();

}
