package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class MerChantIncidentCreateResult
 * @Description
 * @Author rookie
 * @Date 2024/6/19 9:02
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerChantIncidentCreateResult {

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
    }

}
