package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class QueryInterceptResult
 * @Description
 * @Author rookie
 * @Date 2024/6/18 16:44
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryInterceptResult {

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

    /**
     * 拦截状态查询出参数据
     */
    private QueryInterceptStatusData data;


    public static class QueryInterceptStatusData {

        /**
         * 运单号
         */
        private String billCode;

        /**
         * 服务编码
         */
        private String serviceCode;

        /**
         * 状态：INTERCEPTING，拦截中； INTERCEPT_SUCCESS，拦截成功； INTERCEPT_FAIL，拦截失败； INTERCEPT_CANCEL，取消拦截； PACKAGE_DELIVERYING，退改中； INTERCEPT_DISCONTINUE，拦截完结；
         */
        private String status;

        /**
         * 状态中文描述：参考状态描述
         */
        private String statusName;
    }
}
