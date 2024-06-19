package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class AreaUnobstructedRequest
 * @Description 区域停发验证查询
 * @Author rookie
 * @Date 2024/6/19 10:18
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AreaUnobstructedRequest {

    /**
     * 详细地址
     */
    private String address;

    /**
     * 省
     */
    private String province;

    /**
     * 市
     */
    private String city;

    /**
     * 区
     */
    private String district;
}
