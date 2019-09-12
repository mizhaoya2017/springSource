package com.mzy.source.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopDemo {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("aop/aspectTest.xml");
        TestBean bean = (TestBean)bf.getBean("test");
        bean.test();
    }
}
