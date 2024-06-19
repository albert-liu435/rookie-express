package com.rookie.bigdata.zto.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rookie.bigdata.zto.bean.afterservice.CancelInterceptResult;
import com.rookie.bigdata.zto.bean.basicservice.AreaUnobstructedRequest;
import com.rookie.bigdata.zto.bean.basicservice.AreaUnobstructedResult;
import com.rookie.bigdata.zto.bean.basicservice.StructureNamePhoneAddressRequest;
import com.rookie.bigdata.zto.bean.basicservice.StructureNamePhoneAddressResult;
import com.rookie.bigdata.zto.service.BasicZtoService;
import com.rookie.bigdata.zto.service.ZtoExpressService;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

/**
 * @Class BasicZtoServiceImpl
 * @Description 中通基础服务
 * @Author rookie
 * @Date 2024/6/19 10:17
 * @Version 1.0
 */
@RequiredArgsConstructor
public class BasicZtoServiceImpl implements BasicZtoService {

    private static final Gson GSON = new GsonBuilder().create();

    private final ZtoExpressService ztoService;


    @Override
    public AreaUnobstructedResult areaUnobstructed(AreaUnobstructedRequest areaUnobstructedRequest) throws IOException {
        String url = String.format("%s/zto.open.areaUnobstructed", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(areaUnobstructedRequest), null);

        return GSON.fromJson(postJson, AreaUnobstructedResult.class);
    }

    @Override
    public StructureNamePhoneAddressResult structureNamePhoneAddress(StructureNamePhoneAddressRequest structureNamePhoneAddressRequest) throws IOException {
        String url = String.format("%s/zto.open.areaUnobstructed", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(structureNamePhoneAddressRequest), null);

        return GSON.fromJson(postJson, StructureNamePhoneAddressResult.class);
    }
}
