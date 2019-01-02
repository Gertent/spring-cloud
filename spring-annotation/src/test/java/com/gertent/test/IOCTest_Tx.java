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
import com.gertent.tx.TxConfig;
import com.gertent.tx.UserService;

public class IOCTest_Tx {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(TxConfig.class);

        UserService userService = applicationContext.getBean(UserService.class);

        userService.insertUser();
        applicationContext.close();
    }

}
