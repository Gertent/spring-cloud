package com.gertent.zuul;

import com.gertent.zuul.filter.AccessFilter;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

/**
 * Created by wyf on 2017/8/8.
 */
@EnableZuulProxy
@SpringCloudApplication
public class Application {

    public static void main(String[] args){
        new SpringApplicationBuilder(Application.class).web(true).run(args);
        System.out.println("启动成功......");
    }

    /**
     * 过滤器
    */
//    @Bean
//    public AccessFilter accessFilter(){
//        return  new AccessFilter();
//    }
}
