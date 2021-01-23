package com.demo.service;

import com.demo.entity.Word;
import com.demo.mapper.WordMapper;
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
}