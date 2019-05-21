package com.testapplicationlistener;

import org.springframework.context.ApplicationEvent;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Event extends ApplicationEvent {
    public Event(Object source) {
        super(source);
    }

    @Override
    public String toString() {
        return "这是我的自定义事件";
    }
}
