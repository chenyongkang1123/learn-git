package com.springaop;

import org.aspectj.lang.annotation.*;

/**
 * Created by Administrator on 2019/5/21.
 */
@Aspect
public class Logg {
    @Pointcut("execution(* com.springaop.*.*.(..)")
   public void selectAll(){

   }
    @Before("selectAll()")
    public void beforeAdvice(){
      System.out.println("before Advice");
    }
    @After("selectAll()")
    public void afterAdvice(){
        System.out.println("after Advice");
    }
    @AfterReturning(pointcut = "selectAll()",returning ="o")
    public void afterreturnAdvice(Object o){
        System.out.println("afterReturning"+o.toString());
    }
    @AfterThrowing(pointcut = "selectAll()",throwing = "e")
    public void afterthrowingAdvice(IllegalArgumentException e){
        System.out.println("afterThrowing"+e.toString());
    }

}
