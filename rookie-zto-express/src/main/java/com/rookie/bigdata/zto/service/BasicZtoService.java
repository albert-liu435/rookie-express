package com.rookie.bigdata.zto.service;

import com.rookie.bigdata.zto.bean.basicservice.AreaUnobstructedRequest;
import com.rookie.bigdata.zto.bean.basicservice.AreaUnobstructedResult;
import com.rookie.bigdata.zto.bean.basicservice.StructureNamePhoneAddressRequest;
import com.rookie.bigdata.zto.bean.basicservice.StructureNamePhoneAddressResult;

import java.io.IOException;

/**
 * @Class BasicService
 * @Description 基础服务
 * https://open.zto.com/#/documents?menuId=10&type=inter
 * @Author rookie
 * @Date 2024/6/19 10:16
 * @Version 1.0
 */
public interface BasicZtoService {

    /**
     * https://open.zto.com/#/interfaces?resourceGroup=10&apiName=zto.open.areaUnobstructed
     * zto.open.areaUnobstructed-区域停发验证查询
     * 区域停发验证查询
     *
     * @param areaUnobstructedRequest
     * @return
     * @throws IOException
     */
    AreaUnobstructedResult areaUnobstructed(AreaUnobstructedRequest areaUnobstructedRequest) throws IOException;

    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=10&apiName=zto.innovate.structureNamePhoneAddress
     * zto.innovate.structureNamePhoneAddress-智能解析
     * 对地址、姓名、电话等，进行智能识别
     *
     * @param structureNamePhoneAddressRequest
     * @return
     * @throws IOException
     */
    StructureNamePhoneAddressResult structureNamePhoneAddress(StructureNamePhoneAddressRequest structureNamePhoneAddressRequest) throws IOException;
}
