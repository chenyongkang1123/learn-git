package com.testbeanref;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class TEST {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        BANJI banji =(BANJI)ac.getBean("banji");
        banji.learn();
    }

}
