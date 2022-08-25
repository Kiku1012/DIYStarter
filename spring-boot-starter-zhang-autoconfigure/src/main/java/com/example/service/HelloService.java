package com.example.service;

import com.example.HelloProperties;
import javax.annotation.Resource;

public class HelloService {

    @Resource
    HelloProperties helloProperties;
    public String say(String username){
        return helloProperties.getPrefix()+"："+username+helloProperties.getSuffix();
    }
}
