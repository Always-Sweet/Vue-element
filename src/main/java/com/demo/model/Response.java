package com.demo.model;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 接口响应
 *
 * @author zhangcb
 * @time 2020/01/21
 */
@ApiModel(value = "响应Response", description = "接口响应信息")
public class Response {

    /**
     * 状态码
     */
    @ApiModelProperty(value = "状态码", name = "code", example = "100")
    private String code;

    /**
     * 状态码描述
     */
    @ApiModelProperty(value = "状态码描述", name = "message", example = "成功")
    private String message;

    /**
     * 结果信息
     */
    @ApiModelProperty(value = "结果信息", name = "result", example = "{}")
    private Object result;

    public Response() {
    }

    public Response(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
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

    public Object getResult() {
        return result;
    }

    public void setResult(Object result) {
        this.result = result;
    }
}
