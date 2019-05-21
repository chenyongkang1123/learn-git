package com.contextannoationconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration

public class ClassA {
    @Bean
    public  A getA (){
        return  new A();
    }

}
