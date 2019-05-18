package com.testbeanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

/**
 * Created by Administrator on 2019/5/18.
 */
public class HelloWorld {
    public String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public HelloWorld() {
    }
    public void initMethod(){
        System.out.println(message+"正在执行初始化bean");
    }
    public void destoryMethod(){
        System.out.println(message+" 正在执行销毁bean");
    }

}
