package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Student {

    private String name;

    private String age;

    public String getName() {
        return name;
    }
    public String getAge(){
        return age;
    }
@Required
    public void setName(String name) {
        this.name = name;
    }
@Required
    public void setAge(String age) {
        this.age = age;
    }
}
