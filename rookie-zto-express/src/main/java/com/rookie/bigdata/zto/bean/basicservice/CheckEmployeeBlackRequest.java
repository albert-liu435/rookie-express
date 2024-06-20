package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Class CheckEmployeeBlackRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/20 9:03
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CheckEmployeeBlackRequest {

    /**
     * 手机号(手机号和身份证号必填一个)
     */
    private String phone;

    /**
     * 身份证号码(手机号和身份证号必填一个)
     */
    private String idCard;

    /**
     * 调用方唯一标识
     */
    private String appId;

    /**
     * 黑名单原因分类不传查所有类型
     */
    private List<String> blackCategory;

    /**
     * 黑名单原因子类不传查所有子类型
     */
    private List<String> blackSecondCategoryList;

    /**
     * 黑名单对象分类：2001-直营员工黑名单2002-网点员工/业务员黑名单2003-承运商司机黑名单2005-临时操作工2006-网点外包人员
     */
    private List<String> blackType;
}
