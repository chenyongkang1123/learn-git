package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

/**
 * Created by Administrator on 2019/5/21.
 */
public class Teacher {
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

    public void throwIllException(){
        System.out.print("exception raised");
        throw new IllegalArgumentException("抛出了一个异常");
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Teacher teacher =(Teacher) ac.getBean("teacher");
        System.out.println(teacher.getAge());
        System.out.println(teacher.getName());

    }

}
