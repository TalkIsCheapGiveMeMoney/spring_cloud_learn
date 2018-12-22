package com.yyh.service;

import com.yyh.entity.HelloService;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * Created by Administrator on 2018/12/21 0021.
 */
@FeignClient(value = "consulservice03",fallback = FallbackHelloService.class)
public interface HelloServiceConsumer extends HelloService {
}
