package com.mzy.source.customElementParse;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Client {
    public static void main(String[] args) {
        ApplicationContext bf = new ClassPathXmlApplicationContext("test/customtag/test.xml");
        User user = (User)bf.getBean("testbean");
        System.out.println(user.getUsername()+","+user.getEmail());
    }
}
