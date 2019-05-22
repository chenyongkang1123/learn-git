package com.springjdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by Administrator on 2019/5/21.
 */
public class Test {
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("springjdbc.xml");
        StudentTemplate studentTemplate =(StudentTemplate)ac.getBean("studenttemplate");
        studentTemplate.create("汪正洋",14);
        studentTemplate.create("高斯林",64);
       Student student1= studentTemplate.getStudent(2);
        System.out.println(student1.getName());
        List<Student> list = studentTemplate.listStudents();
        for(Student lists: list){
            System.out.print(lists.getName()+"       "+lists.getAge());
        }
        studentTemplate.update(1,18);
        studentTemplate.delete(1);
        List<Student> list1 = studentTemplate.listStudents();
        for(Student lists: list1){
            System.out.print(lists.getName()+"       "+lists.getAge());
        }

    }
}
