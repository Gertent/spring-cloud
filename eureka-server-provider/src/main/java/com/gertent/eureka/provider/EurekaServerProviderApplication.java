package com.gertent.eureka.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * 注册服务提供者
 * @author wyf
 * @date 2017/12/4
*/
@EnableDiscoveryClient
@SpringBootApplication
public class EurekaServerProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerProviderApplication.class, args);
		System.out.println("启动成功......");
	}
}
