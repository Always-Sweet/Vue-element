package com.demo.controller;

import com.demo.entity.Word;
import com.demo.model.Response;
import com.demo.service.WordService;
import com.demo.utils.ResultBuilder;
import com.demo.utils.validatorgroup.ModifyWordCheck;
import com.demo.utils.validatorgroup.SaveWordCheck;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

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

    /**
     * 新增单词
     *
     * @param word
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    @PostMapping()
    private Response save(@RequestBody @Validated(value = SaveWordCheck.class) Word word) {
        return ResultBuilder.success(wordService.save(word));
    }

    /**
     * 修改单词信息
     *
     * @param word
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    @PutMapping()
    private Response modify(@RequestBody @Validated(value = ModifyWordCheck.class) Word word) {
        return ResultBuilder.success(wordService.update(word));
    }

    /**
     * 删除单词
     *
     * @param ids
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    @DeleteMapping()
    private Response remove(@RequestParam("ids") String ids) {
        return ResultBuilder.success(wordService.delete(Arrays.asList(ids.split(","))));
    }
}
