package com.gertent.test;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gertent.bean.Boss;
import com.gertent.bean.Car;
import com.gertent.bean.Color;
import com.gertent.bean.Red;
import com.gertent.config.MainConifgOfAutowired;
import com.gertent.dao.BookDao;
import com.gertent.service.BookService;

public class IOCTest_Autowired {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConifgOfAutowired.class);

        BookService bookService = applicationContext.getBean(BookService.class);
        System.out.println(bookService);

        //BookDao bean = applicationContext.getBean(BookDao.class);
        //System.out.println(bean);

        Boss boss = applicationContext.getBean(Boss.class);
        System.out.println(boss);
        Car car = applicationContext.getBean(Car.class);
        System.out.println(car);

        Color color = applicationContext.getBean(Color.class);
        System.out.println(color);
        System.out.println(applicationContext);
        applicationContext.close();
    }

}
