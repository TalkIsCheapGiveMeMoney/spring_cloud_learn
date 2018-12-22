package com.yyh.springcloudlearn.consulservice3.controller;

import com.yyh.entity.Customer;
import com.yyh.entity.HelloService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2018/12/21 0021.
 */
@RestController
@RequestMapping("hello")
public class HelloController implements HelloService {
    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private int servicePort;
    @Override
    public String say() {
        return "hello world! I'm '" + serviceName + ":" + servicePort + "'";
    }

    @Override
    public Customer s(@PathVariable("id") String id) {
        Customer customer = new Customer();
        customer.setLastName(id);
        return customer;
    }
}
