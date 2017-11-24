package com.gertent.eureka.register.provider;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * Created by wyf on 2017/7/28.
 * 该服务注册到eureka-server模块的注册中心
 */
@EnableDiscoveryClient
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args){
        SpringApplication.run(HelloApplication.class,args);
        System.out.println("启动成功......");
    }
}
