package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class MerChantIncidentQueryRequest
 * @Description 售后工单状态查询
 * @Author rookie
 * @Date 2024/6/19 9:09
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerChantIncidentQueryRequest {

    /**
     * 中通工单号
     */
    private String bizNo;

    /**
     * 中通运单号
     */
    private String billCode;
}
