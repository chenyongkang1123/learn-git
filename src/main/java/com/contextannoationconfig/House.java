package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class House {
    @Autowired(required = true)
     Chair chair;

    public House() {
        System.out.println("这是house的无参构造方法");
    }

    public void bz(){
        chair.bz();
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        House house = (House)ac.getBean("house");
        house.bz();
    }


}
