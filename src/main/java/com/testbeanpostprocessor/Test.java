package com.testbeanpostprocessor;

import com.beanfactory.BeanFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by Administrator on 2019/5/18.
 */
public class Test {
    public static void main(String [] args) {
        AbstractApplicationContext abstractApplicationContext = new ClassPathXmlApplicationContext("bean.xml");
        HelloWorld hw = (HelloWorld) abstractApplicationContext.getBean("beanpostprocessor");
        System.out.println(hw.getMessage());
        abstractApplicationContext.registerShutdownHook();
    }
}
