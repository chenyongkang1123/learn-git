package com.testapplicationlistener;

import com.beanautowird.Customer;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;

/**
 * Created by Administrator on 2019/5/20.
 */
public class EventPublisherAware implements ApplicationEventPublisherAware {
    private ApplicationEventPublisher applicationEventPublisher;
    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher=applicationEventPublisher;

    }
    public void publish(){
       Event event = new Event(this);
        applicationEventPublisher.publishEvent(event);
    }
}
