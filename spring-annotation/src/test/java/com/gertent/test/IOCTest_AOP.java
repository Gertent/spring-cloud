package com.gertent.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gertent.aop.MathCalculator;
import com.gertent.bean.Boss;
import com.gertent.bean.Car;
import com.gertent.bean.Color;
import com.gertent.bean.Red;
import com.gertent.config.MainConfigOfAOP;
import com.gertent.config.MainConifgOfAutowired;
import com.gertent.dao.BookDao;
import com.gertent.service.BookService;

public class IOCTest_AOP {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfigOfAOP.class);

        //1、不要自己创建对象
//		MathCalculator mathCalculator = new MathCalculator();
//		mathCalculator.div(1, 1);
        MathCalculator mathCalculator = applicationContext.getBean(MathCalculator.class);

        mathCalculator.div(1, 0);

        applicationContext.close();
    }

}
