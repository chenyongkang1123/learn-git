package com.beanautowird;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class SuperMarket {
    private Customer customer;
    private  String  name;
    public SuperMarket() {
        System.out.print("supermarket正在营业");
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    public void selectshop(){
        customer.selectshop();
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        SuperMarket sm =(SuperMarket) ac.getBean("supermarket");
        sm.getCustomer().selectshop();
        System.out.println(sm.getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
