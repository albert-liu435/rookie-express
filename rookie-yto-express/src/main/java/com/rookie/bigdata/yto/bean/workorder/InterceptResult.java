package com.rookie.bigdata.yto.bean.workorder;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class InterceptResult
 * @Description
 * @Author rookie
 * @Date 2024/6/14 18:13
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InterceptResult {

    private Integer statusCode;

    private String statusMessage;


}
