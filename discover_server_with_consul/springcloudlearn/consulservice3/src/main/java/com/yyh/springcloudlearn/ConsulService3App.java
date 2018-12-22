package com.yyh.springcloudlearn;

import com.yyh.entity.Customer;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class ConsulService3App  {

    @Value("${spring.application.name}")
    private String serviceName;

    @Value("${server.port}")
    private int servicePort;

    @RequestMapping("/say")
    public String say(){
        return "hello world! I'm '" + serviceName + ":" + servicePort + "'";
    }
    @RequestMapping("/s/{id}")
    public Customer s(@PathVariable("id") String id) {
        Customer customer = new Customer();
        customer.setLastName(id);
        return customer;
    }


    public static void main(String[] args){
        SpringApplication.run(ConsulService3App.class, args);
    }

}
