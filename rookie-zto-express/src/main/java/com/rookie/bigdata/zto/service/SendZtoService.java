package com.rookie.bigdata.zto.service;

import com.rookie.bigdata.zto.bean.sendservice.CreateOrderRequest;
import com.rookie.bigdata.zto.bean.sendservice.CreateOrderResult;

import java.io.IOException;

/**
 * @Class SendZtoService
 * @Description 寄件服务
 * https://open.zto.com/#/interfaces?resourceGroup=20&apiName=zto.open.createOrder
 * @Author rookie
 * @Date 2024/6/20 10:12
 * @Version 1.0
 */
public interface SendZtoService {


    /**
     * https://open.zto.com/#/interfaces?resourceGroup=20&apiName=zto.open.createOrder
     * zto.open.createOrder-创建订单接口
     * 将订单信息同步至中通（带集团客户编码/电子面单账号时，请提前绑定与appkey的关系）
     *
     * @param createOrderRequest
     * @return
     * @throws IOException
     */
    CreateOrderResult createOrder(CreateOrderRequest createOrderRequest) throws IOException;

}
