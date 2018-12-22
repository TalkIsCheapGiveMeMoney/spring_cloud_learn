package com.yyh.service;

import com.yyh.entity.Customer;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

@Component
public class FallbackHelloService implements HelloServiceConsumer{
    @Override
    public String say() {
        return "service not----- available";
    }

    @Override
    public Customer s(@PathVariable("id") String id) {
        Customer customer = new Customer();
        customer.setFirstName("222");
        customer.setId(987);
        return customer;
    }


}
