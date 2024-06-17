package com.rookie.bigdata.yto.enums;

/**
 * @Class YtoMethod
 * @Description
 * @Author rookie
 * @Date 2024/6/17 17:46
 * @Version 1.0
 */
public enum YtoMethod {


    WANTED_CHANGE_ADAPTER("wanted_change_adapter", "v1");




    private String method;

    private String version;

    YtoMethod(String method, String version) {
        this.method = method;
        this.version = version;
    }

    public String getMethod() {
        return method;
    }

    public void setMethod(String method) {
        this.method = method;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
