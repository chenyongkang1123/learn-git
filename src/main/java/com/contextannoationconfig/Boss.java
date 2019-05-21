package com.contextannoationconfig;

import org.springframework.beans.factory.annotation.Required;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Boss {
    private String name;

    public String getName() {
        return name;
    }
@Required()
    public void setName(String name) {
        this.name = name;
    }
}
