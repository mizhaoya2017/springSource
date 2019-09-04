package com.mzy.source;

import com.mzy.source.containerExpand.UserManager;
import com.mzy.source.getBean.Car;
import com.mzy.source.getBean.CarFactoryBean;
import com.mzy.source.start.MyTestBean;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.test.context.junit4.SpringRunner;

//@RunWith(SpringRunner.class)
//@SpringBootTest
@SuppressWarnings("deprecation")
public class ApplicationTest {

    @Test
    public void test1() {
        BeanFactory bf = new XmlBeanFactory(new ClassPathResource("beanFactoryTest.xml"));
        MyTestBean bean = (MyTestBean)bf.getBean("myTestBean");
        Car car = (Car)bf.getBean("car");
        CarFactoryBean carFactoryBean = (CarFactoryBean)bf.getBean("&car");
        System.out.println("bean");
    }
    @Test
    public void test2() throws Throwable{
        try {
            new ClassPathXmlApplicationContext("test.CircleRely/test.xml");
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    @Test
    public void test3() throws Throwable{
        try {
            ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("test.CircleRely/testPrototype.xml");
            System.out.println(ctx.getBean("testA"));
        } catch (Exception e) {
            Throwable e1 = e.getCause().getCause().getCause();
            throw e1;
        }
    }

    @Test
    public void test4() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("test.containerExpand/test.xml");
        UserManager userManager = (UserManager) ctx.getBean("userManager");
        System.out.println(userManager);
    }

}
