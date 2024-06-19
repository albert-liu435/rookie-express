package com.rookie.bigdata.zto.bean.afterservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Class MerChantIncidentCreateRequest
 * @Description 售后工单创建
 * @Author rookie
 * @Date 2024/6/19 8:51
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class MerChantIncidentCreateRequest {

    /**
     * 请求唯一ID
     */
    private String traceId;

    /**
     * 客户信息 ,Customer
     */
    private MerChantCustomer customer;

    /**
     * 工单信息
     */
    private MerChantIncident incident;

    /**
     * 工单信息 ,Incident
     */
    private IncidentAddressInput incidentAddressInput;

    /**
     * 其他售后信息
     */
    private ExtraInfo extraInfo;


    private static class ExtraInfo {

        /**
         * 期望赔付金额（破损、短少、遗失场景使用）
         */
        private String expectedCompensationAmount;

        /**
         * 赔付渠道（破损、短少、遗失场景使用）
         */
        private String compensationChannel;
        /**
         * 收款客户电话（破损、短少、遗失场景使用）
         */
        private String collectionCustomerMobile;

        /**
         * 客户收款账号名称（破损、短少、遗失场景使用）
         */
        private String collectionCustomerAccountName;

        /**
         * 客户收款账号（破损、短少、遗失场景使用）
         */
        private String collectionCustomerAccountCode;


    }


    /**
     * 工单附加信息（改地址、改电话需要传入的新地址、电话）
     */
    public static class IncidentAddressInput {

        /**
         * 修改后的收件人姓名
         */
        private String name;

        /**
         * 修改后的收件人联系方式
         */
        private String phone;

        /**
         * 修改后的收件省
         */
        private String province;
        /**
         * 修改后的收件市
         */
        private String city;
        /**
         * 修改后的收件区
         */
        private String county;

        /**
         * 修改后的收件详细地址
         */
        private String detail;

        /**
         * 是否复用原收件人姓名和电话（0：不复用；1：复用）
         */
        private String originalRec;

    }


    public static class MerChantIncident {

        /**
         * 事件描述
         */
        private String desc;

        /**
         * 反馈电话
         */
        private String mobile;

        /**
         * 快件内物名称
         */
        private String commodity;

        /**
         * 中通售后工单类型：event-urge 催件；event-sign-not-receive 核实签收未收到；damage-claim 理赔短少；lose-claim 理赔丢失；damage-compensation 破损赔付；check_goods_weight 查重量；edit_delivery_address 改地址；return_to_sender 退回寄件人；return_to_net_code 退回寄件网点；cancel_return 取消退回；cancel_edit_address 取消改地址；modify_recipient_contact_number 改号码；
         */
        private String type;

        /**
         * 中通运单号
         */
        private String billCode;


    }


    public static class MerChantCustomer {

        /**
         * 客户姓名
         */
        private String name;

        /**
         * 客户类型：0=其他，1=下单客户，2=发件客户，3=收件客户，4=网点人员
         */
        private byte type;

        /**
         * 客户id（客户类型=4必填）
         */
        private String id;

        /**
         * 网点名称（客户类型=4必填）
         */
        private String siteName;

        /**
         * 网点编号（客户类型=4必填）
         */
        private String siteCode;

    }

}
