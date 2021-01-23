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

    public List<Word> get() {
        return wordMapper.get();
    }
}