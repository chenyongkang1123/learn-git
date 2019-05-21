package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/20.
 */
public class ClassRom {
    @Autowired
    @Qualifier("student1")
    private Student student;

    public String getStudentName(){
        return student.getName();
    }
    public String age(){
        return  student.getAge();
    }

    public Student getStudent() {
        return student;
    }
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        ClassRom classRom =(ClassRom) ac.getBean("classrom");
        System.out.println(classRom.getStudentName());
    }
}
