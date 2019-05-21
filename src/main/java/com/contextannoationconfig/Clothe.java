package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sun.rmi.runtime.Log;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Clothe {
    private Logg logg;
    public Clothe(){
        System.out.println("这是Clothe的无参构造方法");
    }
    public void dolog(){
        logg.dolog();
    }
    @Autowired(required = true)
    public Clothe(Logg logg){
        System.out.println("这是带logg的有参构造方法");
        this.logg = logg;
    }

    public Logg getLogg() {
        return logg;
    }

    public void setLogg(Logg logg) {
        this.logg = logg;
    }
    public static void main(String[]args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Clothe clothe= (Clothe)ac.getBean("clothe");
        clothe.dolog();
    }
}
