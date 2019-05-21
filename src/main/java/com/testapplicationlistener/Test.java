package com.testapplicationlistener;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Test {
    public static void main(String [] args){
        ConfigurableApplicationContext aac = new ClassPathXmlApplicationContext("bean.xml");
        EventPublisherAware epa=(EventPublisherAware)aac.getBean("eventpublisheraware");
        epa.publish();
    }
}
