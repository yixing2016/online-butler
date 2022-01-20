package com.sqin.quartz.job;

import lombok.Setter;
import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * @author Sheng, Qin
 * 2022-01-20 13:45
 */
@Setter
@DisallowConcurrentExecution
public class SalesReportJob implements Job {

    private String name;

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("sales report job for " + name);
    }
}
