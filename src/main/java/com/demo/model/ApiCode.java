package com.demo.model;

/**
 * 接口状态码
 *
 * @author zhangcb
 * @time 2020/01/21
 */
public enum ApiCode {

    SUCCESS("100", "成功"),
    FORBIDDEN("200", ""), // 请求失败：message根据实际情况而定
    SERVER_ERROR("300", ""); // 请求失败：message根据实际情况而定

    private String code;
    private String message;

    ApiCode() {
    }

    ApiCode(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
