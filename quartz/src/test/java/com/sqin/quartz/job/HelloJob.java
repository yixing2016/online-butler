package com.sqin.quartz.job;

import lombok.Setter;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Sheng, Qin
 * 2022-01-19 17:00
 */
@Setter
public class HelloJob implements Job {

    String name;

    @Override
    public void execute(JobExecutionContext jobExecutionContext) throws JobExecutionException {
        System.out.println(jobExecutionContext.getTrigger());

        System.out.println(System.currentTimeMillis() + "...: " + name + " is cleaning");
    }

}
