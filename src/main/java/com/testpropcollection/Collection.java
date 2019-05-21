package com.testpropcollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.*;

/**
 * Created by Administrator on 2019/5/20.
 */
public class Collection {
    List list;
    Map map;
    Set set;
    Properties properties;
    public static void main(String [] args){
        ApplicationContext ac = new ClassPathXmlApplicationContext("bean.xml");
        Collection collection = (Collection)ac.getBean("collection");
        System.out.println(collection.getList());
        System.out.println(collection.getMap());
        System.out.println(collection.getProperties());
        System.out.println(collection.getSet());

    }

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }

    public Set getSet() {
        return set;
    }

    public void setSet(Set set) {
        this.set = set;
    }

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
