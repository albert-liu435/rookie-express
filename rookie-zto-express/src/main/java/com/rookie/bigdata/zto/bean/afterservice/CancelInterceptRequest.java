package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class CancelInterceptRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/13 13:57
 * @Version 1.0
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CancelInterceptRequest {
    /**
     * 外部工单号标识信息
     */
    private String thirdBizNo;

    /**
     * 中通运单号
     */
    private String billCode;
}
