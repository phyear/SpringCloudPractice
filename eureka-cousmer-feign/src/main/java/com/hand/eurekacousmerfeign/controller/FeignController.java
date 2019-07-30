package com.hand.eurekacousmerfeign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeignController {
    @Autowired
    Feige feige;
    @RequestMapping("/consumer")
   public String getA(){
        return "feign服务:"+feige.getDc();
   }
}
