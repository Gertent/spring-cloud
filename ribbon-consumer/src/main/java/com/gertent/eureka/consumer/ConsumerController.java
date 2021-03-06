package com.gertent.eureka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by wyf on 2017/7/28.
 */
@RestController
public class ConsumerController {

//    @Autowired
//    RestTemplate restTemplate;

    @Autowired
    HelloService helloService;

    @RequestMapping(value="/ribbon-consumer",method = RequestMethod.GET)
    public String helloCustomer(){
//        return restTemplate.getForEntity("http://HELLO-SERVICE/hello",String.class).getBody();
        return helloService.helloService();
    }
}
