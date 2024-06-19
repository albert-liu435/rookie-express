package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class AreaUnobstructedResult
 * @Description
 * @Author rookie
 * @Date 2024/6/19 10:20
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaUnobstructedResult {


    /**
     * 返回状态，true：调用成功；false：调用失败
     */
    private boolean status;

    /**
     * 返回状态Code，错误情况详见错误码解释
     */
    private String statusCode;

    /**
     * 返回消息，错误情况详见错误码解释
     */
    private String messag;


    private ResultData result;

    /**
     * 返参信息
     */
    public static class ResultData {

        /**
         * 停发类型(A00 省停发 A01 市停发 A02 区停发 A03 网点停发 A04 三段码停发 B00 创新部地址解析异常放行 B01 藏经阁省市区接口异常放行 B02 电子面单白名单放行 B03 内部异常放行 B04 正常放行 B05 创新部地址补全异常放行)
         */
        private String forbidType;

        /**
         * 停发原因
         */
        private String forbidReason;

        /**
         * 0 放行 1 禁行
         */
        private String isUnobstructed;

    }
}
