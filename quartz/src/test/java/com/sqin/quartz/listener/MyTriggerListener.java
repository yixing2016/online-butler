package com.sqin.quartz.listener;

import org.quartz.JobExecutionContext;
import org.quartz.Trigger;
import org.quartz.TriggerListener;

/**
 * @author Sheng, Qin
 * 2022-01-20 17:47
 */
public class MyTriggerListener implements TriggerListener {

    @Override
    public String getName() {
        return "trigger listener qin";
    }

    @Override
    public void triggerFired(Trigger trigger, JobExecutionContext context) {
        System.out.println("trigger fired " + context.getTrigger().getKey());
    }

    @Override
    public boolean vetoJobExecution(Trigger trigger, JobExecutionContext context) {
        return false;
    }

    @Override
    public void triggerMisfired(Trigger trigger) {
        System.out.println("trigger misfired " + trigger.getKey());
    }

    @Override
    public void triggerComplete(Trigger trigger, JobExecutionContext context, Trigger.CompletedExecutionInstruction triggerInstructionCode) {
        System.out.println(trigger.getKey() + " completed.");
    }
}
