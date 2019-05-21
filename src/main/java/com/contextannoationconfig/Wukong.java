package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Wukong {
    @Resource(name = "boss")
    private Boss boss;

    public Boss getBoss() {
        return boss;
    }

    public void setBoss(Boss boss) {
        this.boss = boss;
    }
    public Wukong(){
        System.out.println("这是悟空的无参构造方法");
    }
    public static void main(String [] args){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
        Wukong wukong =(Wukong) applicationContext.getBean("wukong");
        System.out.println(wukong.getBoss().getName());

    }
}
