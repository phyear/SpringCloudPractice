package com.hand.eurekacousmerfeign.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("eureka-client")
public interface Feige {
    @GetMapping("/dc")
   String getDc();
}
