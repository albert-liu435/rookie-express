package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class bindingEaccountRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/19 11:58
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class BindingEaccountRequest {

    private String eaccount;

    private String siteCode;

    private String address;

    private String addressDetail;

    private String eaccountPwd;
}
