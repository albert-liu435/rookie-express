package com.rookie.bigdata.zto.enums;

/**
 * @Class EncryptionType
 * @Description
 * @Author rookie
 * @Date 2024/6/13 11:48
 * @Version 1.0
 */
public enum EncryptionType {
    MD5("MD5"),
    SHA256("SHA256"),
    HmacSHA256("HmacSHA256");

    private String code;

    EncryptionType(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

}
