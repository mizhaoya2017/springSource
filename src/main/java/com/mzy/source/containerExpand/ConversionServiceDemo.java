package com.mzy.source.containerExpand;

import org.springframework.core.convert.support.DefaultConversionService;

import java.util.Date;

public class ConversionServiceDemo {
    public static void main(String[] args) {
        DefaultConversionService conversionService = new DefaultConversionService();
        conversionService.addConverter(new String2DateConverter());
        String a = "2019-09-06 17:59:00";
        Date b = conversionService.convert(a, Date.class);
        System.out.println(b);
    }
}
