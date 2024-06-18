package com.rookie.bigdata.zto.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rookie.bigdata.zto.bean.afterservice.*;
import com.rookie.bigdata.zto.service.ZtoAfterSaleService;
import com.rookie.bigdata.zto.service.ZtoService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;

/**
 * @Class ZtoInterceptServiceImpl
 * @Description 中通售后服务
 * @Author rookie
 * @Date 2024/6/13 13:50
 * @Version 1.0
 */
//@Slf4j
@RequiredArgsConstructor
public class ZtoAfterSaleServiceImpl implements ZtoAfterSaleService {

    private static final Gson GSON = new GsonBuilder().create();

    private final ZtoService ztoService;

    /**
     * 拦截服务取消接口，取消商家/ISV发起的拦截工单
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.cancelIntercept
     *
     * @param cancelInterceptRequest
     * @return
     * @throws IOException
     */
    @Override
    public CancelInterceptResult cancelIntercept(CancelInterceptRequest cancelInterceptRequest) throws IOException {

        String url = String.format("%s/thirdcenter.cancelIntercept", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(cancelInterceptRequest), null);

        return GSON.fromJson(postJson, CancelInterceptResult.class);
    }

    /**
     * 拦截服务发起接口，提供给商家/ISV发起拦截退改服务。
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.createIntercept
     *
     * @param createInterceptRequest
     * @return
     * @throws IOException
     */
    @Override
    public CreateInterceptResult createIntercept(CreateInterceptRequest createInterceptRequest) throws IOException {
        String url = String.format("%s/thirdcenter.createIntercept", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(createInterceptRequest), null);

        return GSON.fromJson(postJson, CreateInterceptResult.class);
    }

    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.queryInterceptAndReturnStatus
     * thirdcenter.queryInterceptAndReturnStatus-拦截状态查询接口
     *
     * @param queryInterceptRequest
     * @return
     * @throws IOException
     */
    @Override
    public QueryInterceptResult queryInterceptAndReturnStatus(QueryInterceptRequest queryInterceptRequest) throws IOException {
        String url = String.format("%s/thirdcenter.queryInterceptAndReturnStatus", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(queryInterceptRequest), null);

        return GSON.fromJson(postJson, QueryInterceptResult.class);
    }
}
