package com.sqin.flowable.article.service.api;

import com.sqin.flowable.article.model.Approval;
import com.sqin.flowable.article.model.Article;

import java.util.List;

/**
 * @author Sheng, Qin
 * 2022-01-24 15:30
 */
public interface ArticleWorkflowService {

    void startProcess(Article article);

    List<Article> getTasks(String assignee);

    void submitReview(Approval approval);

}
