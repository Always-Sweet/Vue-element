package com.demo.exception;

import com.demo.model.Response;
import com.demo.utils.ResultBuilder;
import org.springframework.validation.BindException;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ExceptionHandlerExceptionResolver;

/**
 * 统一异常处理
 *
 * @author zhangcb
 * @time 2020/01/21
 */
@RestControllerAdvice
public class XExceptionHandler extends ExceptionHandlerExceptionResolver {

    @ExceptionHandler(Exception.class)
    public Response handler(Exception e) {
        if (e instanceof BindException) {
            BindingResult result = ((BindException) e).getBindingResult();
            return validatorCheck(result);
        } else if (e instanceof MethodArgumentNotValidException) {
            BindingResult result = ((MethodArgumentNotValidException) e).getBindingResult();
            return validatorCheck(result);
        } else if (e instanceof LogicException) {
            return ResultBuilder.failure(e.getMessage());
        }

        // 未拦截的异常
        e.printStackTrace();
        return ResultBuilder.failure(e);
    }

    /**
     * Hibernate Validator 错误信息拼装
     *
     * @param result
     * @return
     */
    public Response validatorCheck(BindingResult result) {
        StringBuffer buffer = new StringBuffer();
        for (ObjectError error : result.getAllErrors()) {
            buffer.append(error.getDefaultMessage()).append(",");
        }
        if (buffer.length() > 0) {
            buffer.delete(buffer.length() - 1, buffer.length());
        }
        return ResultBuilder.failure(buffer.toString());
    }
}
