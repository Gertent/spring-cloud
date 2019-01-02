package com.gertent.test;

import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gertent.aop.MathCalculator;
import com.gertent.bean.Boss;
import com.gertent.bean.Car;
import com.gertent.bean.Color;
import com.gertent.bean.Red;
import com.gertent.config.MainConfigOfAOP;
import com.gertent.config.MainConifgOfAutowired;
import com.gertent.dao.BookDao;
import com.gertent.ext.ExtConfig;
import com.gertent.service.BookService;

public class IOCTest_Ext {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext  = new AnnotationConfigApplicationContext(ExtConfig.class);


        //发布事件；
        applicationContext.publishEvent(new ApplicationEvent(new String("我发布的时间")) {
        });

        applicationContext.close();
    }

}
