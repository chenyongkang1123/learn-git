package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.portlet.context.AbstractRefreshablePortletApplicationContext;

/**
 * Created by Administrator on 2019/5/21.
 */
public class Student {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public  void getThrowException() {
        System.out.println("raise IllegalArgumentException");
        throw new IllegalArgumentException();
    }
    public static void main(String [] args) throws IllegalArgumentException{
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Student student =(Student)ac.getBean("aopstudent");
        System.out.println(student.getName());
        System.out.println(student.getAge());
        student.getThrowException();
    }

}