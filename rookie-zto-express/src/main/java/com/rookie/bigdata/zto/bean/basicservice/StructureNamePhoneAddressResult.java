package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class StructureNamePhoneAddressResutl
 * @Description 智能解析
 * @Author rookie
 * @Date 2024/6/19 10:31
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StructureNamePhoneAddressResult {


    /**
     * 返回状态，true：调用成功；false：调用失败
     */
    private boolean status;

    /**
     * 返回状态Code，错误情况详见错误码解释
     */
    private String statusCode;

    /**
     * 返回消息，错误情况详见错误码解释
     */
    private String messag;

    /**
     * 返回值
     */
    private ResultData result;

    public static class ResultData {

        /**
         * 电话
         */
        private String phone;

        /**
         * 姓名
         */
        private String name;
        /**
         * 备注
         */
        private String remark;

        /**
         * 地址信息
         */
        private AddressData address;
        /**
         * 虚拟手机分机号
         */
        private String ext;

    }

    public static class AddressData {
        /**
         * 省份
         */
        private String province;
        /**
         * 省份id
         */
        private String provinceId;
        /**
         * 市
         */
        private String city;
        /**
         * 市id
         */
        private String cityId;
        /**
         * 县区
         */
        private String county;
        /**
         * 县区id
         */
        private String countyId;
        /**
         * 详细地址
         */
        private String detail;
    }
}
