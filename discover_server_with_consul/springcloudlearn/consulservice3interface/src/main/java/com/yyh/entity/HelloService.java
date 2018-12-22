package com.yyh.entity;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface HelloService {

    @RequestMapping(value = "say")
    String say();

    @RequestMapping(value = "s/{id}")
    Customer s(@PathVariable("id") String id);
}
