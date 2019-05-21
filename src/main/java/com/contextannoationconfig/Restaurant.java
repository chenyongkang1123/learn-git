package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Restaurant {
    private String name;
    private String local;

    public Restaurant() {
    }

    public String getName() {
        return name;
    }
    @Required
    public void setName(String name) {
        this.name = name;
    }

    public String getLocal() {
        return local;
    }
    @Required
    public void setLocal(String local) {
        this.local = local;
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Restaurant restaurant =(Restaurant)ac.getBean("restaurant");
        System.out.println(restaurant.getName()+" "+restaurant.getLocal());
    }

}
