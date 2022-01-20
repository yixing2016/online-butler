package com.sqin.quartz.listener;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.quartz.JobListener;

/**
 * @author Sheng, Qin
 * 2022-01-20 17:39
 */
public class MyJobListener implements JobListener {

    @Override
    public String getName() {
        return "job listener qin";
    }

    @Override
    public void jobToBeExecuted(JobExecutionContext context) {
        System.out.println("to be executed" + context.getJobDetail().getKey());
    }

    @Override
    public void jobExecutionVetoed(JobExecutionContext context) {
        System.out.println("execution vetoed " + context.getJobDetail().getKey());
    }

    @Override
    public void jobWasExecuted(JobExecutionContext context, JobExecutionException jobException) {

        System.out.println("was executed" + context.getJobDetail().getKey());

    }
}
