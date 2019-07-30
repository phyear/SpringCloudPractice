package com.hand.eurekaconsumerribbon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;

import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class AAController {
//    @Autowired
//    LoadBalancerClient loadBalancerClient ;
    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/getDcA")
    public String getDc(){
        String url="http://eureka-client/dc";
////        ServiceInstance choose = loadBalancerClient.choose("eureka-client");
//        String urls="http:"+choose.getHost()+':'+choose.getPort()+"/dc";
        return restTemplate.getForObject(url,String.class);
    }
}
