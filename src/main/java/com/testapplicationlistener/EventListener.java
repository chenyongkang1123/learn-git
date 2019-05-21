package com.testapplicationlistener;

import org.springframework.context.ApplicationListener;

/**
 * Created by Administrator on 2019/5/20.
 */
public class EventListener implements ApplicationListener<Event> {
    @Override
    public void onApplicationEvent(Event event) {
       System.out.println(event.toString());
    }
}
