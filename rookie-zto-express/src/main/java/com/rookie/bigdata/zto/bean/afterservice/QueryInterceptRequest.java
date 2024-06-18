package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class QueryInterceptRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/18 16:43
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class QueryInterceptRequest {

    /**
     * 运单号
     */
    private String billCode;
}
