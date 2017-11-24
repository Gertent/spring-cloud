package com.gertent.feign.consumer;

import com.gertent.feign.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by wyf on 2017/8/8.
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloService helloService;

    @RequestMapping(value="/feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value="/feign-consumer2",method=RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder sb=new StringBuilder();
        sb.append(helloService.hello()).append("\n");
        sb.append(helloService.hello("zhangsan")).append("\n");
        sb.append(helloService.hello("zhangsan",20)).append("\n");
        sb.append(helloService.hello(new User("zhangsan",60))).append("\n");
        return sb.toString();
    }
}
