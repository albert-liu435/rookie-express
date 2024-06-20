package com.rookie.bigdata.zto.bean.sendservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class OrderCodeNewRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/20 10:55
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class OrderCodeNewRequest {

    /**
     * 有效时间（24小时制的请求时间，和网络时间间隔不能超过2小时）
     */
    private String datetime;

    private String partner;

    private String verify;

//    private Content content;

    //TODO


}
