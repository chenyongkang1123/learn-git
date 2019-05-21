package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Employee {
    private  Money money;
    private  Work work;

    public Money getMoney() {
        return money;
    }
    @Autowired(required = true)
    public void setMoney(Money money) {
        this.money = money;
    }

    public Work getWork() {
        return work;
    }
@Autowired(required = false)
    public void setWork(Work work) {
        this.work = work;
    }

    public static void main(String [] args){
       ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Employee employee = (Employee)ac.getBean("employee");
        System.out.println(employee.getMoney().getMoney()+"         "+employee.getWork());
    }
}
