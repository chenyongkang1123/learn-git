package com.contextannoationconfig;

import org.omg.CORBA.SystemException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2019/5/20.
 */
@Configuration
public class SuperMarket {

    @Bean
    public Shop getShop(){
        return new Shop();
    }
    public static  void  main(String [] args){
        ApplicationContext ac = new AnnotationConfigApplicationContext(SuperMarket.class);
        Shop shop = (Shop) ac.getBean(Shop.class);
        shop.setName("火腿肠");
        System.out.println(shop.getName());
    }
}
