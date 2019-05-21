package com.contextannoationconfig;

/**
 * Created by Administrator on 2019/5/20.
 */
public class DongWuYuan {
    private Tiger tiger ;

    public DongWuYuan(Tiger tiger) {
        this.tiger = tiger;
    }

    public Tiger getTiger() {
        return tiger;
    }

    public void setTiger(Tiger tiger) {
        this.tiger = tiger;
    }
    public void  tigereat(){
        tiger.eat();
    }
}
