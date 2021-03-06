package com.yyh.service;

import com.yyh.entity.Customer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
@FeignClient(value = "consulservice03",fallback = FallbackSayService.class)
public interface SayService {

    @RequestMapping(value = "say")
    String say();

    @RequestMapping(value = "s/{id}")
    Customer s(@PathVariable("id") String id);
}
