package com.demo.utils;

import com.demo.model.ApiCode;
import com.demo.model.Response;

/**
 * 接口响应构造器
 *
 * @author zhangcb
 * @time 2020/01/21
 */
public class ResultBuilder {

    /**
     * 响应成功（无数据）
     *
     * @return
     */
    public static Response success() {
        ApiCode code = ApiCode.SUCCESS;
        return new Response(code.getCode(), code.getMessage(), null);
    }

    /**
     * 响应成功（返回数据）
     *
     * @return
     */
    public static Response success(Object data) {
        ApiCode code = ApiCode.SUCCESS;
        return new Response(code.getCode(), code.getMessage(), data);
    }

    /**
     * 请求失败（异常）
     *
     * @return
     */
    public static Response failure(Exception e) {
        ApiCode error = ApiCode.SERVER_ERROR;
        return new Response(error.getCode(), error.getMessage(), e.getMessage());
    }

    /**
     * 请求失败（拒绝）
     *
     * @return
     */
    public static Response failure(String message) {
        ApiCode error = ApiCode.FORBIDDEN;
        return new Response(error.getCode(), error.getMessage(), message);
    }

}
