package com.mzy.source.containerExpand;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.text.MessageFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

public class i18nDemo {
    public static void main(String[] args) {
        String[] configs = {"test.containerExpand/applicationContext.xml"};
        ApplicationContext ctx = new ClassPathXmlApplicationContext(configs);
        Object[] params = {"John", new GregorianCalendar().getTime()};
        String str1 = ctx.getMessage("test", params, Locale.US);
        String str2 = ctx.getMessage("test", params, Locale.CHINA);
        System.out.println(str1);
        System.out.println(str2);



//        String pattern1 = "{0}，你好！你于{1}在工商银行存入{2}元。";
//        String pattern2 = "At {1, time, short} On {1, date, long} {0} paid {2, number, currency}";
//        Object[] params = {"John", new GregorianCalendar().getTime(), 1.0E3};
//        String msg1 = MessageFormat.format(pattern1,params);
//        MessageFormat mf = new MessageFormat(pattern2, Locale.US);
//        String msg2 = mf.format(params);
//        System.out.println(msg1);
//        System.out.println(msg2);
    }
}
