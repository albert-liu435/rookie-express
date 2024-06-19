package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

/**
 * @Class MerChantIncidentQueryResult
 * @Description
 * @Author rookie
 * @Date 2024/6/19 9:09
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerChantIncidentQueryResult {

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
     * 请求唯一ID
     */
    private String traceId;

    /**
     * 工单创建结果
     */
    private ResultData result;

    public static class ResultData {
        /**
         * 中通工单号
         */
        private String bizNo;

        /**
         * 中通运单号
         */
        private String billCode;

        /**
         * 工单处理状态
         */
        private String incidentStatus;

        /**
         * 工单处理状态：created，已受理；processing，处理中；finished，已完结
         */
        private String incidentMessage;

        /**
         * 取消退回状态
         */
        private String cancelReturn;

        /**
         * 取消改地址状态
         */
        private String changeDest;

        /**
         * 查询重量结果（KG）
         */
        private String weight;

        /**
         * 工单处理明细
         */
        private List<HandleRecords> handleRecords;
    }

    public static class HandleRecords {

        /**
         * 处理时间
         */
        private Date handleTime;

        /**
         * 回复内容
         */
        private String reply;
    }

}
