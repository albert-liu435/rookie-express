package com.rookie.bigdata.yto.bean;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class YtoRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/14 18:06
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class YtoRequest {

    private String sign;

    private String timestamp;

    private String param;

    private String format;


}
