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
            JobDetail job = JobBuilder.newJob(HelloJob.class)
                    .withIdentity("myJob", "group1")
                    .build();

            Trigger trigger = TriggerBuilder.newTrigger()
                    .withIdentity("myTrigger", "group1")
                    .startNow()
                    .withSchedule(simpleSchedule().withIntervalInSeconds(40).repeatForever())
                    .build();

            scheduler.scheduleJob(job, trigger);


        } catch (SchedulerException e) {
            e.printStackTrace();
        }
    }

}
