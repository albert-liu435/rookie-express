package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class CheckEmployeeBlackResult
 * @Description
 * @Author rookie
 * @Date 2024/6/20 9:03
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckEmployeeBlackResult {

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


    private Object result;
}
