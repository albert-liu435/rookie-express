package com.rookie.bigdata.yto.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rookie.bigdata.yto.bean.workorder.ChangeInterceptRequest;
import com.rookie.bigdata.yto.bean.workorder.InterceptResult;
import com.rookie.bigdata.yto.config.YTOConfig;
import com.rookie.bigdata.yto.enums.YtoMethod;
import com.rookie.bigdata.yto.service.WorkOrderService;
import com.rookie.bigdata.yto.service.YtoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Class ZtoInterceptServiceImpl
 * @Description 圆通工单服务
 * @Author rookie
 * @Date 2024/6/13 13:50
 * @Version 1.0
 */
@Slf4j
@RequiredArgsConstructor
public class WorkOrderServiceImpl implements WorkOrderService {

    private static final Gson GSON = new GsonBuilder().create();

    private final YtoService ytoService;
    //    https://openuat.yto56test.com:6443/open/wanted_change_adapter/v1/QTG4O9a/K9991024989a


    @Override
    public InterceptResult createIntercept(ChangeInterceptRequest changeInterceptRequest) throws IOException {


        YTOConfig config = this.ytoService.getConfig();
        YtoMethod wantedChangeAdapter = YtoMethod.WANTED_CHANGE_ADAPTER;
        String uri = getURI(config, wantedChangeAdapter);

        String toJson = GSON.toJson(changeInterceptRequest);

        String dataParam = getDataParam(toJson, wantedChangeAdapter, config);

        String s = ytoService.postJson(uri, dataParam);

//        String url = String.format("%s/open/%s/%s/%s/%s", this.ytoService.getYtoBaseUrl(), YtoMethod.WANTED_CHANGE_ADAPTER.getMethod(), YtoMethod.WANTED_CHANGE_ADAPTER.getVersion(), config.getUrlKey(), config.getAppKey());


        return null;
    }


    public String getDataParam(String json, YtoMethod ytoMethod, YTOConfig ytoConfig) {
        String dataParam = json + ytoMethod.getMethod() + ytoMethod.getVersion() + ytoConfig.getAppSecret();
        return dataParam;
    }


    public String getURI(YTOConfig ytoConfig, YtoMethod ytoMethod) {

        String uri = String.format("%s/open/%s/%s/%s/%s", this.ytoService.getYtoBaseUrl(), ytoMethod.getMethod(), ytoMethod.getVersion(), ytoConfig.getUrlKey(), ytoConfig.getAppKey());
        return uri;
    }


    /**
     * 拦截服务取消接口，取消商家/ISV发起的拦截工单
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.cancelIntercept
     *
     * @param cancelInterceptRequest
     * @return
     * @throws IOException
     */
//    @Override
//    public CancelInterceptResult cancelIntercept(CancelInterceptRequest cancelInterceptRequest) throws IOException {
//
//        String url = String.format("%s/thirdcenter.cancelIntercept", this.ytoService.getYtoBaseUrl());
//
//        String postJson = ytoService.postJson(url, GSON.toJson(cancelInterceptRequest), null);
//
//        return GSON.fromJson(postJson, CancelInterceptResult.class);
//    }

    /**
     * 拦截服务发起接口，提供给商家/ISV发起拦截退改服务。
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.createIntercept
     *
     * @param createInterceptRequest
     * @return
     * @throws IOException
     */
//    @Override
//    public CreateInterceptResult createIntercept(CreateInterceptRequest createInterceptRequest) throws IOException {
//        String url = String.format("%s/thirdcenter.createIntercept", this.ytoService.getYtoBaseUrl());
//
//        String postJson = ytoService.postJson(url, GSON.toJson(createInterceptRequest), null);
//
//        return GSON.fromJson(postJson, CreateInterceptResult.class);
//    }
}
