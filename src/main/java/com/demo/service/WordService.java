package com.demo.service;

import com.demo.entity.Word;
import com.demo.exception.LogicException;
import com.demo.mapper.WordMapper;
import com.demo.model.ApiCode;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 单词 service
 *
 * @author zhangcb
 * @time 2020/01/20
 */
@Service
public class WordService {

    @Autowired
    private WordMapper wordMapper;

    /**
     * 查找单词（唯一）
     *
     * @param id 单词主键
     * @return
     * @author zhangcb
     * @time 2020/01/20
     */
    public Word get(String id) {
        return wordMapper.get(id);
    }

    /**
     * 搜索单词（模糊）
     *
     * @param searchValue 词名
     * @return
     * @author zhangcb
     * @time 2020/01/20
     */
    public List<Word> query(String searchValue) {
        return wordMapper.query(searchValue);
    }

    /**
     * 新增单词
     *
     * @param word
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    public String save(Word word) {
        wordMapper.save(word);
        return word.getWordId();
    }

    /**
     * 修改单词信息
     *
     * @param word
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    public boolean update(Word word) {
        int row = wordMapper.update(word);
        return row > 0;
    }

    /**
     * 删除单词
     *
     * @param ids
     * @return
     * @author zhangcb
     * @time 2020/01/25
     */
    public boolean delete(List<String> ids) {
        int row = 0;
        if (CollectionUtils.isNotEmpty(ids)) {
            row = wordMapper.delete(ids);
        } else {
            new LogicException(ApiCode.FORBIDDEN, "");
        }
        return row > 0;
    }
}