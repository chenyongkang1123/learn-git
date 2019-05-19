package com.testbeanextend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class Test {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Animal animal =(Animal) ac.getBean("animal1");
        Tiger tiger =(Tiger)ac.getBean("tiger");
        System.out.println(animal.getName()+"的性别"+animal.getSex());
        System.out.println(tiger.getName()+"的性别"+tiger.getSex()+"是否强壮"+tiger.getIsstrong());
        Tiger tiger1=(Tiger)ac.getBean("tiger1");
        System.out.println(tiger1.getName()+tiger.getIsstrong()+tiger.getSex());
    }
}
