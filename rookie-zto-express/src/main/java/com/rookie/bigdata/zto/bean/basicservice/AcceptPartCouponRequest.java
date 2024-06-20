package com.rookie.bigdata.zto.bean.basicservice;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Class AcceptPartCouponRequest
 * @Description
 * @Author rookie
 * @Date 2024/6/20 9:10
 * @Version 1.0
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AcceptPartCouponRequest {

    /**
     * 中通userId
     */
    private String ztoUserId;

    /**
     * 优惠券码集合
     */
    private List<String> couponCodes;

    /**
     * 优惠券模板集合
     */
    private List<String> couponTemplateIds;
}
