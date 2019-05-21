package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by Administrator on 2019/5/20.
 */
public class PIG {

    private String name;
    public PIG(){
        System.out.println("这是小猪的无参构造方法");
    }
    public PIG(String name){
        System.out.println(name+"的小猪的有参构造方法");
    }

    @PostConstruct
    public void initMethod(){
        System.out.println(name+"正在执行初始化方法");
    }
    @PreDestroy
    public void destoryMethod(){
        System.out.println(name+"正在执行销毁方法");
    }

    public String getName() {
        return name;
    }
@Required()
    public void setName(String name) {
        this.name = name;
    }
    public static void main(String [] args){
        AbstractApplicationContext aac = new ClassPathXmlApplicationContext("bean.xml");
        PIG pig =(PIG)aac.getBean("pig");
        System.out.println(pig.getName());
        aac.registerShutdownHook();
    }
}
