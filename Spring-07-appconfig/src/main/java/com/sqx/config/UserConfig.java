package com.sqx.config;

import com.sqx.pojo.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class UserConfig {

    @Bean
    public User getUser(){
        return new User();
    }

}
