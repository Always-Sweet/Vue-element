package com.demo.exception;

import com.demo.model.ApiCode;

/**
 * 内部逻辑拒绝
 *
 * @author zhangcb
 * @time 2020/01/21
 */
public class LogicException extends Exception {

    /**
     * 状态码
     */
    private ApiCode code;

    public LogicException(ApiCode code, String message) {
        super(message);
        this.code = code;
    }

    public ApiCode get() {
        return code;
    }
}
