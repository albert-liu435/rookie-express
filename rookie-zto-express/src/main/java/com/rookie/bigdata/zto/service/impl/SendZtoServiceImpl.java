package com.rookie.bigdata.zto.service.impl;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.rookie.bigdata.zto.bean.basicservice.AreaUnobstructedResult;
import com.rookie.bigdata.zto.bean.sendservice.CreateOrderRequest;
import com.rookie.bigdata.zto.bean.sendservice.CreateOrderResult;
import com.rookie.bigdata.zto.service.SendZtoService;
import com.rookie.bigdata.zto.service.ZtoExpressService;
import lombok.RequiredArgsConstructor;

import java.io.IOException;

/**
 * @Class SendZtoServiceImpl
 * @Description
 * @Author rookie
 * @Date 2024/6/20 10:14
 * @Version 1.0
 */
@RequiredArgsConstructor
public class SendZtoServiceImpl implements SendZtoService {


    private static final Gson GSON = new GsonBuilder().create();

    private final ZtoExpressService ztoService;


    @Override
    public CreateOrderResult createOrder(CreateOrderRequest createOrderRequest) throws IOException {
        String url = String.format("%s/zto.open.areaUnobstructed", this.ztoService.getZtoBaseUrl());

        String postJson = ztoService.postJson(url, GSON.toJson(createOrderRequest), null);

        return GSON.fromJson(postJson, CreateOrderResult.class);
    }
}
