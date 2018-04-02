package com.yyh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableDiscoveryClient
@RestController
@Configuration
public class ConsulClient3App {
    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

    @Autowired
    private  RestTemplate restTemplate;

    private static final String  SERVICE_ID = "consulservice3";

    @RequestMapping("/say")
    public String sayService() {
        return restTemplate.getForObject("http://"+SERVICE_ID+"/say",String.class);
    }

    public static void main(String[] args){
        SpringApplication.run(ConsulClient3App.class, args);
    }

}