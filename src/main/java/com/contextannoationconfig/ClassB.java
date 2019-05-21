package com.contextannoationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration
@Import(ClassA.class)
public class ClassB {
    @Bean
    public A getA(){
       return new A();
    }

    public static void main(String [] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(ClassB.class);
        A a =(A)ac.getBean(A.class);

    }

}
