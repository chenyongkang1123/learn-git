package com.beanautowird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Cup {
     private Water water;
     private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Water getWater() {
        return water;
    }

    public void setWater(Water water) {
        this.water = water;
    }

    public Cup() {
        System.out.println("这是杯子的无参构造");
    }


    public void push(){
        water.push();
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Cup  cup =(Cup)ac.getBean("cup");
        System.out.println("杯子的名字是"+cup.getName());
        cup.push();
    }
}
