package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class StructureNamePhoneAddressRequest
 * @Description 智能解析
 * @Author rookie
 * @Date 2024/6/19 10:31
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StructureNamePhoneAddressRequest {

    /**
     * 地址信息
     * 如：张三 13812345678 上海市青浦区华新华志路1685号
     */
    private String address;
}
