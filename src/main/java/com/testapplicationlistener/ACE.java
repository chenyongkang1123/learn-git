package com.testapplicationlistener;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class ACE {
    private String message;

    public String getMessage() {
        return message;
    }
@Required
    public void setMessage(String message) {
        this.message = message;
    }
    public static void main(String [] args){
        ConfigurableApplicationContext ac =  new ClassPathXmlApplicationContext("bean.xml");
        ac.start();
        ACE ace =(ACE)ac.getBean("ace");
        System.out.println(ace.getMessage());
        ac.stop();
    }
}
