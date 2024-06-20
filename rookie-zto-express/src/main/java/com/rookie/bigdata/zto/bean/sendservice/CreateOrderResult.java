package com.rookie.bigdata.zto.bean.sendservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class CreateOrderResult
 * @Description
 * @Author rookie
 * @Date 2024/6/20 10:16
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderResult {

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
     * 返回结果
     */
    public OrderResult result;


    public static class OrderResult {

        /**
         * 大头笔信息
         */
        private BigMarkInfo bigMarkInfo;
        /**
         * 2小时取件码（当vasType增值信息中有twoHour的时候返回）
         */
        private String verifyCode;
        /**
         * 单号所属网点code（预约件）
         */
        private String siteCode;
        /**
         * 单号所属网点名称（预约件）
         */
        private String siteName;
        /**
         * 签单返回信息
         */
        private SignBillInfo signBillInfo;

        /**
         * 订单号
         */
        private String orderCode;

        /**
         * 运单号
         */
        private String billCode;

        /**
         * 合作商订单号
         */
        private String partnerOrderCode;


    }

    public static class SignBillInfo {
        /**
         * 签单返回运单号
         */
        private String billCode;
        /**
         * 签单返回订单号
         */
        private String orderCode;
    }

    public static class BigMarkInfo {
        /**
         * 集包地
         */
        private String bagAddr;

        /**
         * 大头笔
         */
        private String mark;
    }

}
