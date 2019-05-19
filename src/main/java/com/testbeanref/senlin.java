package com.testbeanref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class senlin {
     Animal animal;
     Flower flower;
     Tree tree;
    public senlin(Animal animal, Flower flower, Tree tree) {
        this.animal = animal;
        this.flower = flower;
        this.tree = tree;
    }

    public static void main(String [] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        senlin senlin=(senlin)applicationContext.getBean("senlin");

    }
}