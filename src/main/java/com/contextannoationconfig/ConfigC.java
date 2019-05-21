package com.contextannoationconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration
public class ConfigC {
    @Bean(initMethod = "init" ,destroyMethod = "destory" )
    @Scope("prototype")
    public C getC(){
        return new C();
    }
    public static void main(String [] args){{
        ApplicationContext ac = new AnnotationConfigApplicationContext(ConfigC.class);
        C c =(C)ac.getBean(C.class);
    }}

}
