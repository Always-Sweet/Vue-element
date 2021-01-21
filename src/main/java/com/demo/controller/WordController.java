package com.demo.controller;

import com.demo.model.Response;
import com.demo.utils.ResultBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 单词 controller
 *
 * @author zhangcb
 * @time 2020/01/20
 */
@RestController
@RequestMapping("/word")
public class WordController {

    @GetMapping()
    private Response get() {
        return ResultBuilder.success();
    }
}
