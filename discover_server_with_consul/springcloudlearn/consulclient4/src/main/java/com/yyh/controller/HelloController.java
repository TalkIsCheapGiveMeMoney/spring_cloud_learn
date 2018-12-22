package com.yyh.controller;

import com.yyh.entity.Customer;
import com.yyh.service.HelloServiceConsumer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/21 0021.
 */
@RestController
@RequestMapping("/hello")
public class HelloController {
    @Autowired
    HelloServiceConsumer helloServiceConsumer;
    @RequestMapping("/say/{id}")
    public Customer get(@PathVariable("id") String id){
        return  helloServiceConsumer.s(id);
    }
}
