package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @Author wyf
 * @Date 2018/2/5
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "hello world!";
    }
}
