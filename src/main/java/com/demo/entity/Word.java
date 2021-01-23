package com.demo.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * 单词 entity
 *
 * @author zhangcb
 * @time 2020/01/20
 */
@ApiModel(value = "单词", description = "单词信息")
public class Word {

    /**
     * 主键
     */
    @ApiModelProperty(value = "主键", name = "id", example = "id")
    private String wordId;

    /**
     * 单词
     */
    @ApiModelProperty(value = "单词", name = "content", example = "-")
    private String content;

    /**
     * 分类
     */
    @ApiModelProperty(value = "分类", name = "classification", example = "id")
    private String classification;

    /**
     * 新增时间
     */
    @ApiModelProperty(value = "新增时间", name = "insertTime", example = "2021-01-01 00:00:00")
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private String insertTime;

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(String insertTime) {
        this.insertTime = insertTime;
    }
}
