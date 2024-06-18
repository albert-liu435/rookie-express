package com.rookie.bigdata.zto.service;

import com.rookie.bigdata.zto.bean.afterservice.*;

import java.io.IOException;

/**
 * @Class ZtoInterceptService
 * @Description https://open.zto.com/#/documents?menuId=40&type=inter
 * @Author rookie
 * @Date 2024/6/13 13:49
 * @Version 1.0
 */
public interface ZtoAfterSaleService {


    /**
     * 拦截服务取消接口，取消商家/ISV发起的拦截工单
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.cancelIntercept
     *
     * @param cancelInterceptRequest
     * @return
     * @throws IOException
     */
    CancelInterceptResult cancelIntercept(CancelInterceptRequest cancelInterceptRequest) throws IOException;


    /**
     * 拦截服务发起接口，提供给商家/ISV发起拦截退改服务。
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.createIntercept
     *
     * @param createInterceptRequest
     * @return
     * @throws IOException
     */
    CreateInterceptResult createIntercept(CreateInterceptRequest createInterceptRequest) throws IOException;

    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.queryInterceptAndReturnStatus
     * thirdcenter.queryInterceptAndReturnStatus-拦截状态查询接口
     *
     * @param queryInterceptRequest
     * @return
     * @throws IOException
     */
    QueryInterceptResult queryInterceptAndReturnStatus(QueryInterceptRequest queryInterceptRequest) throws IOException;

}
