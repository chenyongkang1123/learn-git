package com.springaop;

/**
 * Created by Administrator on 2019/5/21.
 */
public class Logging {
    public void beforeAdvice(){
       System.out.println("before advice");
    }
    public void afterAdvice(){
        System.out.println("after advice");
    }
    public void afterreturnAdvice(Object advice){
        System.out.println("afterreturnAdvice"+advice);
    }
    public void afterreturnException(IllegalArgumentException a){
        System.out.println("afterreturnException"+a);
    }
}
