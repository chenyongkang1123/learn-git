package com.contextannoationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration
public class China {


    @Bean
    public jiangsu getJiangsu(){
        return  new  jiangsu();
    }
    public China(){
        System.out.println("这是中国的无参构造方法");
    }
    public static void main(String [] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(China.class);
        jiangsu jiangsu =(jiangsu)ac.getBean(com.contextannoationconfig.jiangsu.class);
        System.out.println(jiangsu.location);
    }

}
