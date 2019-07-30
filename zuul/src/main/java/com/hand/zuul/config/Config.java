package com.hand.zuul.config;

import com.hand.zuul.filter.CheckingFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    public CheckingFilter checkingFilter(){
         return  new CheckingFilter();
    }
}
