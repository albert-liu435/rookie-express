package com.rookie.bigdata.yto.service.impl;

import cn.hutool.core.date.DateUtil;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rookie.bigdata.yto.bean.YtoRequest;
import com.rookie.bigdata.yto.config.YTOConfig;
import com.rookie.bigdata.yto.service.WorkOrderService;
import com.rookie.bigdata.yto.service.YtoService;
import com.rookie.bigdata.yto.util.HttpUtil;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.codec.digest.DigestUtils;

import java.io.IOException;
import java.time.Instant;


/**
 * @Class ZtoServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/13 11:34
 * @Version 1.0
 */
public class YtoServiceImpl implements YtoService {


    private static final Gson GSON = new GsonBuilder().create();

    @Setter
    @Getter
    private WorkOrderService workOrderService = new WorkOrderServiceImpl(this);

    private YTOConfig config;

    @Override
    public String getYtoBaseUrl() {
        return this.getConfig().getYtoBaseUrl();
    }

    @Override
    public YTOConfig getConfig() {
        return this.config;
    }

    @Override
    public void setConfig(YTOConfig config) {
        this.config = config;
    }

    @Override
    public String postJson(String url, String data) throws IOException {

        Instant instant = Instant.now();

        Long l = instant.toEpochMilli();


        String sign = encryptSignForOpen(data);

        YtoRequest ytoRequest = new YtoRequest();
        ytoRequest.setParam(data);
        ytoRequest.setSign(sign);
        ytoRequest.setFormat("JSON");
//        ytoRequest.setTimestamp();




        return HttpUtil.postJson(url, GSON.toJson(ytoRequest));

    }


    /**
     * 开放平台公共加密方法-使用commons-codec-1.11.jar进行md5加密,然后对数组进行base64编码
     *
     * @param data   = param+method+v
     * @param secret
     * @return
     */
    public static String encryptSignForOpen(String data, String secret) {
        String sign;
        try {
            byte[] signByte = DigestUtils.md5(data + secret);
            sign = Base64.encodeBase64String(signByte);
        } catch (Throwable e) {

//            logger.error();
//            logger.error("加密失败.e:{}.", e.toString());
            sign = "ERROR";
        }
        return sign;
    }

    /**
     * 开放平台公共加密方法-使用commons-codec-1.11.jar进行md5加密,然后对数组进行base64编码
     *
     * @param data = param+method+v
     * @return
     */
    public static String encryptSignForOpen(String data) {
        String sign;
        try {
            byte[] signByte = DigestUtils.md5(data);
            sign = Base64.encodeBase64String(signByte);
        } catch (Throwable e) {

//            logger.error();
//            logger.error("加密失败.e:{}.", e.toString());
            sign = "ERROR";
        }
        return sign;
    }
}
