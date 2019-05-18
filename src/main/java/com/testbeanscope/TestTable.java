package com.testbeanscope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/*
 * Created by Administrator on 2019/5/18.
 */
public class TestTable {
    public  static  void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        table table =(table) ac.getBean("table");
        System.out.println(table.hashCode());
        table table1 =(table) ac.getBean("table");
        System.out.println(table.equals(table1));
        System.out.print(table1.hashCode());
    }
}
