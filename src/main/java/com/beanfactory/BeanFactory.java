package com.beanfactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.AbstractFileResolvingResource;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 2019/5/17.
 */
public class BeanFactory {
    public static void main(String[]args){




        XmlBeanFactory xbf = new XmlBeanFactory(new ClassPathResource("bean.xml"));

        Person person =(Person)xbf.getBean("person");
        System.out.println(person.getName());

    }


}
