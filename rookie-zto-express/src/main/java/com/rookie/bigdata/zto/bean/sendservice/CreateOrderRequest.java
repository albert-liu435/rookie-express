package com.rookie.bigdata.zto.bean.sendservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Class CreateOrderRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/20 10:16
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class CreateOrderRequest {

    /**
     * 合作模式 ，1：集团客户；2：非集团客户
     */
    private String partnerType;

    /**
     * partnerType为1时，orderType：1：全网件 2：预约件。 partnerType为2时，orderType：1：全网件 2：预约件（返回运单号） 3：预约件（不返回运单号） 4：星联全网件
     */
    private String orderType;

    /**
     * 合作商订单号
     */
    private String partnerOrderCode;

    /**
     * 账号信息 ,Account
     */
    private AccountInfo accountInfo;

    /**
     * 运单号
     */
    private String billCode;

    /**
     * 发件人信息 ,SenderInfoInput
     */
    private SendInfo sendInfo;

    /**
     * 收件人信息 ,ReceiveInfoInput
     */
    private ReceiveInfo receiveInfo;

    /**
     * 增值服务信息
     */
    private List<OrderVas> orderVasList;

    /**
     * 门店/仓库编码（partnerType为1时可使用）
     */
    private String hallCode;
    /**
     * 网点code（orderVasList.vasType为receiveReturnService必填）
     */
    private String siteCode;
    /**
     * 网点名称（orderVasList.vasType为receiveReturnService必填）
     */
    private String siteName;

    /**
     * 汇总信息 ,SummaryDto
     */
    private SummaryInfo summaryInfo;

    /**
     * 备注
     */
    private String remark;

    /**
     * 物品信息
     */
    private List<OrderItem> orderItems;
    /**
     * 机柜信息 ,ExpressCabinetDto
     */
    private Cabinet cabinet;

    public static class Cabinet {

        /**
         * 地址
         */
        private String address;
        /**
         * 格口规格 格口大小( 1 大 2 中 3 小）
         */
        private Integer specification;

        /**
         * 开箱码
         */
        private String code;

    }

    public static class OrderItem {

        /**
         * 货品名称
         */
        private String name;

        /**
         * 商品分类
         */
        private String category;

        /**
         * 商品材质
         */
        private String material;

        /**
         * 大小（长,宽,高）(单位：厘米), 用半角的逗号来分隔长宽高
         */
        private String size;

        /**
         * 重量（单位：克)
         */
        private Long weight;

        /**
         * 单价(单位:元)
         */
        private Integer unitprice;

        /**
         * 货品数量
         */
        private Integer quantity;
        /**
         * 货品备注
         */
        private String remark;


    }


    public static class SummaryInfo {

        /**
         * 订单包裹大小（单位：厘米、格式：”长，宽，高”，用半角的逗号来分隔）
         */
        private String size;

        /**
         * 订单包裹内货物总数量
         */
        private Integer quantity;

        /**
         * 商品总价值（单位：元）
         */
        private BigDecimal price;
        /**
         * 运输费（单位：元）
         */
        private BigDecimal freight;
        /**
         * 险费（单位：元）
         */
        private BigDecimal premium;

        /**
         * 取件开始时间
         */
        private Date startTime;
        /**
         * 取件截止时间
         */
        private Date endTime;

    }


    public static class OrderVas {
        /**
         * 增值类型 （COD：代收； vip：中通标快； insured：保价； receiveReturnService：签单返回； twoHour：两小时；standardExpress：中通好快）
         */
        private String vasType;
        /**
         * 增值价格，如果增值类型涉及金额会校验，vasType为COD、insured时不能为空，单位：分
         */
        private Long vasAmount;
        /**
         * 增值价格（暂时不用）
         */
        private Long vasPrice;
        /**
         * 增值详情
         */
        private String vasDetail;
        /**
         * 代收账号（有代收货款增值时必填）
         */
        private String accountNo;

    }


    public static class ReceiveInfo {

        /**
         * 收件人姓名
         */
        private String receiverName;
        /**
         * 收件人座机（与receiverMobile二者不能同时为空）
         */
        private String receiverPhone;
        /**
         * 收件人手机号（与 receiverPhone二者不能同时为空）
         */
        private String receiverMobile;

        /**
         * 收件人省
         */
        private String receiverProvince;
        /**
         * 收件人市
         */
        private String receiverCity;
        /**
         * 收件人区
         */
        private String receiverDistrict;
        /**
         * 收件人详细地址
         */
        private String receiverAddress;

    }


    public static class SendInfo {
        /**
         * 发件人姓名
         */
        private String senderId;

        /**
         * 发件人座机（与senderMobile二者不能同时为空）
         */
        private String sendName;

        /**
         * 发件人手机号（与senderPhone二者不能同时为空）
         */
        private String senderMobile;

        /**
         * 发件人省
         */
        private String senderProvince;

        /**
         * 发件人市
         */

        private String senderCity;
        /**
         * 发件人区
         */
        private String senderDistrict;

        /**
         * 发件人详细地址
         */
        private String senderAddress;


    }


    public static class AccountInfo {

        /**
         * 电子面单账号（partnerType为2，orderType传1,2,4时必传）
         */
        private String accountId;

        /**
         * 电子面单密码（测试环境传ZTO123）
         */
        private String accountPassword;

        /**
         * 单号类型:1.普通电子面单；74.星联电子面单；默认是1
         */
        private short type;
        /**
         * 集团客户编码（partnerType传1时必传）
         */
        private String customerId;

    }
}
