package com.example.demo;

import org.apache.log4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
@RestController
@EnableAutoConfiguration
public class Application {

	private static Logger logger=Logger.getLogger(Application.class);

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		logger.info("项目启动......");
	}

	@RequestMapping("/")
	public String home(){
		return "hello world2";
	}
}
