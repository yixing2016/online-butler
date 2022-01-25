package com.sqin.flowable.listener;

import org.flowable.common.engine.api.delegate.event.FlowableEvent;
import org.flowable.common.engine.api.delegate.event.FlowableEventListener;
import org.springframework.stereotype.Component;

/**
 * @author Sheng, Qin
 * 2022-01-25 13:23
 */
@Component
public class FlowableListener implements FlowableEventListener {

    @Override
    public void onEvent(FlowableEvent flowableEvent) {
        String flowableEventType = flowableEvent.getType().name();

        switch (flowableEventType) {
            case "PROCESS_COMPLETED" :
                System.out.println("flowable event listener : " + flowableEvent.getType().name());
                break;
            default:
                break;
        }
    }

    @Override
    public boolean isFailOnException() {
        return false;
    }

    @Override
    public boolean isFireOnTransactionLifecycleEvent() {
        return false;
    }

    @Override
    public String getOnTransaction() {
        return null;
    }

}
