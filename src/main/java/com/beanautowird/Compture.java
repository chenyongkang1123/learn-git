package com.beanautowird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Compture {
    Processor processor;
     String name;

    public Compture(Processor processor, String name) {
        System.out.println(name+"的电脑的有参构造方法");
        this.processor = processor;
        this.name = name;
    }
    public void run(){
        processor.run();
    }
    public static void main(String [] args ){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Compture compture =(Compture)ac.getBean("compture");
        compture.run();
        System.out.println(compture.name+"  "+compture.processor);
    }
}
