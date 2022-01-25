package com.sqin.flowable.article.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author Sheng, Qin
 * 2022-01-24 16:35
 */
@Setter
@Getter
public class Approval {
    private String taskId;
    private boolean isStatus;
}
