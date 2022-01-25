package com.sqin.flowable.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.sqin.flowable.article.service.api.ArticleWorkflowService;

/**
 * @author Sheng, Qin
 * 2022-01-24 15:27
 */
@RestController
public class FlowableController {

    @Autowired
    private ArticleWorkflowService flowService;

}
