package com.gertent.test;

import javax.sql.DataSource;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.gertent.bean.Boss;
import com.gertent.bean.Car;
import com.gertent.bean.Color;
import com.gertent.bean.Red;
import com.gertent.bean.Yellow;
import com.gertent.config.MainConfigOfProfile;
import com.gertent.config.MainConifgOfAutowired;
import com.gertent.dao.BookDao;
import com.gertent.service.BookService;

public class IOCTest_Profile {

    //1、使用命令行动态参数: 在虚拟机参数位置加载 -Dspring.profiles.active=test
    //2、代码的方式激活某种环境；
    @Test
    public void test01(){
        AnnotationConfigApplicationContext applicationContext =
                new AnnotationConfigApplicationContext();
        //1、创建一个applicationContext
        //2、设置需要激活的环境
        applicationContext.getEnvironment().setActiveProfiles("dev");
        //3、注册主配置类
        applicationContext.register(MainConfigOfProfile.class);
        //4、启动刷新容器
        applicationContext.refresh();


        String[] namesForType = applicationContext.getBeanNamesForType(DataSource.class);
        for (String string : namesForType) {
            System.out.println(string);
        }

        Yellow bean = applicationContext.getBean(Yellow.class);
        System.out.println(bean);
        applicationContext.close();
    }

}
