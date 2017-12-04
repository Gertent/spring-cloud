package com.gertent.eureka;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * Created by wyf on 2017/7/28.
 * 服务注册中心*********
 */
@EnableEurekaServer
@SpringBootApplication
public class ApplicationRegistry {

    public static void main(String[] args){
        new SpringApplicationBuilder(ApplicationRegistry.class).web(true).run(args);
        System.out.println("启动成功......");
    }
}
