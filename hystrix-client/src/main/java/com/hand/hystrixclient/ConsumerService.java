package com.hand.hystrixclient;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class ConsumerService {
    @Autowired
    RestTemplate restTemplate;
    @HystrixCommand(fallbackMethod="fallback")
    public String get(){
        return  restTemplate.getForObject("http://eureka-client/dc",String.class);
    }

    public String  fallback(){
        return "超时了再等等吧";
    }
}
