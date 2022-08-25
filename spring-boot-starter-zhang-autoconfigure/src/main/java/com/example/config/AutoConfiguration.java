package com.example.config;

import com.example.HelloProperties;
import com.example.service.HelloService;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnMissingBean(HelloService.class)
@EnableConfigurationProperties(HelloProperties.class)
public class AutoConfiguration {
    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
