package com.sqin.flowable.article.delegate;

import org.flowable.engine.delegate.DelegateExecution;
import org.flowable.engine.delegate.JavaDelegate;

/**
 * @author Sheng, Qin
 * 2022-01-24 15:33
 */
public class PublishArticleService implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) {
        System.out.println("Publishing the approved article.");
    }

}
