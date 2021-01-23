package com.demo.controller;

import com.demo.model.Response;
import com.demo.service.WordService;
import com.demo.utils.ResultBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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

    @Autowired
    private WordService wordService;

    /**
     * 根据主键查询单词
     *
     * @param id
     * @return
     * @author zhangcb
     * @time 2020/01/23
     */
    @GetMapping()
    private Response get(@RequestParam("id") String id) {
        return ResultBuilder.success(wordService.get(id));
    }

    /**
     * 根据内容搜索单词（目前仅支持词名搜索，且模糊）
     *
     * @param searchValue
     * @return
     * @author zhangcb
     * @time 2020/01/23
     */
    @GetMapping("/query")
    private Response query(@RequestParam(value = "searchValue", required = false) String searchValue) {
        return ResultBuilder.success(wordService.query(searchValue));
    }
}
