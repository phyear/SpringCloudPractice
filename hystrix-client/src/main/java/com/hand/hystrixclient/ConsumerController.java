package com.hand.hystrixclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
    @Autowired
    ConsumerService consumerService;
    @GetMapping("/dc")
    public String get(){
        return  consumerService.get();
    }

}
