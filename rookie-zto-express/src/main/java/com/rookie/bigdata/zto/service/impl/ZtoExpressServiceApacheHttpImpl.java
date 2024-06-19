package com.rookie.bigdata.zto.service.impl;

import com.rookie.bigdata.zto.util.HttpUtil;
import com.rookie.bigdata.zto.util.ZopDigestUtil;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * @Class ZtoExpressServiceApacheHttpImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/19 18:06
 * @Version 1.0
 */
public class ZtoExpressServiceApacheHttpImpl extends BaseZtoExpressServiceImpl {


    @Override
    public String postJson(String url, String jsonBody, Long timestamp) throws IOException {


        return super.postJson(url, jsonBody, timestamp);

    }
}
