package com.contextannoationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration
public class XuanWu {
    @Bean
    public DongWuYuan getDongWuYuan(){
        return  new DongWuYuan(new Tiger());
    }
    @Bean
    public Tiger getTiger(){
        return  new Tiger();
    }
    public static void main(String [] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(XuanWu.class);
        DongWuYuan dongWuYuan =(DongWuYuan)ac.getBean(DongWuYuan.class);
        dongWuYuan.tigereat();
    }
}
