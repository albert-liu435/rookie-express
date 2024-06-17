package com.rookie.bigdata.yto.service;


import com.rookie.bigdata.yto.bean.workorder.ChangeInterceptRequest;
import com.rookie.bigdata.yto.bean.workorder.InterceptResult;

import java.io.IOException;

/**
 * @Class ZtoInterceptService
 * @Description https://open.yto.net.cn/interfaceDocument/menu295/submenu307
 * @Author rookie
 * @Date 2024/6/13 13:49
 * @Version 1.0
 */
public interface WorkOrderService {


    /**
     * 拦截件更址上报接口
     * 内容概述：本上报接口适用于圆通承运的所有在途运输的快件拦截场景，可对圆通所有有运输合作的商家提供在途快件的“拦截更址”服务，按照商家下发的拦截指令要求，进行“更址”到指定的目的地或目的网点，为商家提升客户服务赋能。
     * <p>
     * 接口功能介绍：通过上报接口可以上报派件前的所有在途运单，支持“拦截更址”类型的拦截服务。
     * <p>
     * https://open.yto.net.cn/interfaceDocument/menu295/submenu308
     *
     * @param changeInterceptRequest
     * @return
     * @throws IOException
     */
    InterceptResult createIntercept(ChangeInterceptRequest changeInterceptRequest) throws IOException;


    /**
     * 拦截服务取消接口，取消商家/ISV发起的拦截工单
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.cancelIntercept
     *
     * @param cancelInterceptRequest
     * @return
     * @throws IOException
     */
//    CancelInterceptResult cancelIntercept(CancelInterceptRequest cancelInterceptRequest) throws IOException;


    /**
     * 拦截服务发起接口，提供给商家/ISV发起拦截退改服务。
     * <p>
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=40&apiName=thirdcenter.createIntercept
     *
     * @param createInterceptRequest
     * @return
     * @throws IOException
     */
//    CreateInterceptResult createIntercept(CreateInterceptRequest createInterceptRequest) throws IOException;


}
