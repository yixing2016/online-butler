package com.sqin.quartz;

import com.sqin.quartz.job.HelloJob;
import org.quartz.*;
import org.quartz.impl.StdSchedulerFactory;

import static org.quartz.SimpleScheduleBuilder.simpleSchedule;

/**
 * @author Sheng, Qin
 * 2022-01-19 16:37
 */
public class QuartzTest {

    public static void main(String[] args) {
        try {

            SchedulerFactory schedulerFactory = new StdSchedulerFactory();
            Scheduler scheduler = schedulerFactory.getScheduler();

            scheduler.start();
            JobDetail jobDetail1 = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("myJob1", "group1")
                    .build();
            jobDetail1.getJobDataMap().put("name", "zhangsan");

            JobDetail jobDetail2 = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("myJob2", "group2")
                    .build();
            jobDetail2.getJobDataMap().put("name", "lise");

            Trigger trigger1 = TriggerBuilder.newTrigger()
                    .withIdentity("myTrigger1", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever())   // trigger per 40s
                    .build();


            Trigger trigger2 = TriggerBuilder.newTrigger()
                    .withIdentity("myTrigger2", "group2")
                    .startNow()
                    .withSchedule(simpleSchedule().withIntervalInSeconds(30).withRepeatCount(3))   // trigger per 40s
                    .build();

            scheduler.scheduleJob(jobDetail1, trigger1);
            scheduler.scheduleJob(jobDetail2, trigger2);


        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
