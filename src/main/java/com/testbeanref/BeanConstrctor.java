package com.testbeanref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class BeanConstrctor {
   public int i;
   public  double d;

    public BeanConstrctor(double d, int i) {
        this.d = d;
        this.i = i;
    }
    public static void main(String[] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        BeanConstrctor beanConstrctor=(BeanConstrctor)applicationContext.getBean("beanconstructor");
       System.out.println(beanConstrctor.i+"   "+beanConstrctor.d);
    }
}
