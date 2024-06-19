package com.rookie.bigdata.yto.bean.workorder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class ChangeInterceptRequest
 * @Description 拦截件更址上报类
 * @Author rookie
 * @Date 2024/6/14 18:15
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ChangeInterceptRequest {
    //运单号码
    private String waybillNo;

    //问题描述
    private String wantedDesc;

    //新收件省名称
    private String receiveProvName;

    //新收件市名称
    private String receiveCityName;

    //新收件区名称
    private String receiveCountyName;

    //新收件详细地址
    private String receiveAddress;

    //新收件人姓名
    private String receiverName;

    //新收件人电话
    private String receiverTel;
}
