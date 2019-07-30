package com.hand.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class BalanceController {
//    @Autowired
//    LoadBalancerClient loadBalancerClient;
    @Autowired
    RestTemplate restTemplate;
    @RequestMapping("/getDc")
    public String getDc(){
//        ServiceInstance choose = loadBalancerClient.choose("eureka-client");
//        String url="http://"+choose.getHost()+":"+choose.getPort()+"/dc";

        String url="http://eureka-client/dc";
        return restTemplate.getForObject(url,String.class);
    }
    
}
