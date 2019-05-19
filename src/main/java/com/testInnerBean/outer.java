package com.testInnerBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by Administrator on 2019/5/19.
 */
public class outer {
    private Inner inner;


    public outer() {
    }

    public outer(Inner inner) {
        this.inner = inner;
    }

    public Inner getInner() {
        return inner;
    }

    public void setInner(Inner inner) {
        this.inner = inner;
    }

    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        outer outer = (outer) ac.getBean("outer");
        outer.getInner().inner();
    }
}
