package com.mzy.source.containerExpand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestEventListenerDemo {
    public static void main(String[] msg) {
        ApplicationContext context = new ClassPathXmlApplicationContext("test.containerExpand/applicationContext.xml");
        TestEvent event = new TestEvent("hello", "msg");
        context.publishEvent(event);
    }
}
