package com.rookie.bigdata.zto.service;

import com.rookie.bigdata.zto.bean.basicservice.*;

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

    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=10&apiName=zto.open.bindingEaccount
     * zto.open.bindingEaccount-绑定电子面单
     * 绑定电子面单与appKey的关系，以便下单或查询轨迹
     *
     * @param bindingEaccountRequest
     * @return
     * @throws IOException
     */
    BindingEaccountResult bindingEaccount(BindingEaccountRequest bindingEaccountRequest) throws IOException;


    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=10&apiName=zto.black.api.checkEmployeeBlack
     * zto.black.api.checkEmployeeBlack-验证是否是员工类黑名单
     * 根据身份证号或手机号验证是否是员工类黑名单
     *
     * @param checkEmployeeBlackRequest
     * @return
     * @throws IOException
     */
    CheckEmployeeBlackResult checkEmployeeBlack(CheckEmployeeBlackRequest checkEmployeeBlackRequest) throws IOException;


    /**
     * https://open.zto.com/#/interfaces?schemeCode=&resourceGroup=10&apiName=zto.toc.selectAcceptPartCoupon
     * zto.toc.selectAcceptPartCoupon-接入方查询优惠券
     * 接入方通过此接口查询通过开放平台发放的中通优惠券
     *
     * @param acceptPartCouponRequest
     * @return
     * @throws IOException
     */
    AcceptPartCouponResult selectAcceptPartCoupon(AcceptPartCouponRequest acceptPartCouponRequest) throws IOException;

}
