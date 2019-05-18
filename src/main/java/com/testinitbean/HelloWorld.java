package com.testinitbean;

/**
 * Created by Administrator on 2019/5/18.
 */
public class HelloWorld {
    public String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void initMethod(){
        System.out.println(name+"正在执行init方法");
    }
    public void destoryMethod(){
        System.out.println(name+"正在执行destory方法");
    }
}
