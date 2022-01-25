package com.sqin.flowable.article.model;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Sheng, Qin
 * 2022-01-24 15:35
 */
@Getter
@Setter
@Data
public class Article {
    private String taskId;
    private String author;
    private String url;

    public Article(String id, String author, String url) {
        this.taskId = id;
        this.author = author;
        this.url = url;
    }
}
