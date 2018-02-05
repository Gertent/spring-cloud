package com.example.demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

/**
 * @Description 加载自定义配置文件
 * @Author wyf
 * @Date 2018/2/5
 */
@SpringBootApplication
public class Application_01 {
    public static void main(String[] args) {
        new SpringApplicationBuilder(Application_01.class).properties("spring.config.location=class://abc.properties").run(args);
    }
}
