package com.sqin.quartz;

import com.sqin.quartz.job.SalesReportJob;
import com.sqin.quartz.listener.MyJobListener;
import com.sqin.quartz.listener.MyTriggerListener;
import lombok.Setter;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;
import static org.quartz.impl.matchers.EverythingMatcher.allJobs;
import static org.quartz.impl.matchers.EverythingMatcher.allTriggers;

/**
 * @author Sheng, Qin
 * 2022-01-20 15:30
 */
@Setter
public class SalesReportJobTest {
    static SchedulerFactory schedulerFactory;
    static Scheduler scheduler;

    static {
        try {
            schedulerFactory = new StdSchedulerFactory();
            scheduler = schedulerFactory.getScheduler();
            scheduler.start();
        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws SchedulerException {
        JobDetail salesReportForJoe = JobBuilder.newJob(SalesReportJob.class)
                .withIdentity("sales report for Joe").build();
        salesReportForJoe.getJobDataMap().put("name", "Joe");


        JobDetail salesReportForMike = JobBuilder.newJob(SalesReportJob.class)
                .withIdentity("sales report for Mike").build();
        salesReportForMike.getJobDataMap().put("name", "Mike");

        Trigger trigger1 = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger1", "group1")
                .startNow()
                .withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever())   // trigger per 40s
                .build();


        Trigger trigger2 = TriggerBuilder.newTrigger()
                .withIdentity("myTrigger2", "group2")
                .startNow()
                .withSchedule(simpleSchedule().withIntervalInSeconds(30).withRepeatCount(3))   // trigger per 30s, repeat 3times
                .build();

        scheduler.scheduleJob(salesReportForJoe, trigger1);
        scheduler.scheduleJob(salesReportForMike, trigger2);
        scheduler.getListenerManager().addJobListener(new MyJobListener(), allJobs());
        scheduler.getListenerManager().addTriggerListener(new MyTriggerListener(), allTriggers());
    }

}
