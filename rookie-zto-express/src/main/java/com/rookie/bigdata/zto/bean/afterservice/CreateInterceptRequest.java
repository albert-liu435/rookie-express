package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class CreateInterceptRequest
 * @Description 发起拦截请求参数
 * @Author rookie
 * @Date 2024/6/13 14:13
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateInterceptRequest {

    /**
     * 中通运单号
     */
    private String billCode;

    /**
     * 请求唯一标识请求ID（幂等校验）
     */
    private String requestId;

    /**
     * 集团客户编码
     */
    private String customerId;

    /**
     * 客户名称
     */
    private String customerName;

    /**
     * 修改收件人电话（拦截类型为3或4必填）
     */
    private String receivePhone;

    /**
     * 修改收件人姓名（拦截类型为3或4必填）
     */
    private String receiveUsername;

    /**
     * 修改详细地址（拦截类型为3或4必填）.如：华新镇华志路1685号
     */
    private String receiveAddress;

    /**
     * 修改地址区（拦截类型为3或4必填）.如： 青浦区
     */
    private String receiveDistrict;

    /**
     * 修改地址市（拦截类型为3或4必填）.如：上海市
     */
    private String receiveCity;

    /**
     * 修改地址省（拦截类型为3或4必填）.如：上海
     */
    private String receiveProvince;

    /**
     * 拦截类型:1返回收件网点；2返回寄件人地址；3修改派送地址；4退回指定地址（必填）
     */
    private Integer destinationType;

    /**
     * 外部业务唯一标识,外部业务单号
     */
    private String thirdBizNo;


}
