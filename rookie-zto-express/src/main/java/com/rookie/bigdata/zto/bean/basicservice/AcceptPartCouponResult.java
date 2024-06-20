package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class AcceptPartCouponResult
 * @Description
 * @Author rookie
 * @Date 2024/6/20 9:10
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AcceptPartCouponResult {

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
     * 返回的对象
     */
    private CouponResult result;


    public static class CouponResult {

        /**
         * 请求状态
         */
        private String success;
        /**
         * 错误状态码
         */
        private String errCode;
        /**
         * 错误信息
         */
        private String errMessage;
        /**
         * 数量
         */
        private int total;
        /**
         * 出参
         */
        private Object data;
    }
}
