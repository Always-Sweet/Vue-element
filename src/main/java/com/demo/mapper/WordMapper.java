package com.demo.mapper;

import com.demo.entity.Word;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 单词 mapper
 *
 * @author zhangcb
 * @time 2020/01/20
 */
@Repository
public interface WordMapper {

    List<Word> get();
}