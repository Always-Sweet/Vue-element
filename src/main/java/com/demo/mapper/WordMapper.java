package com.demo.mapper;

import com.demo.entity.Word;
import org.apache.ibatis.annotations.Param;
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

    Word get(@Param("id") String id);

    List<Word> query(@Param("content") String content);

    void save(Word word);

    int update(Word word);

    int delete(List<String> ids);
}