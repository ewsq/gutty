package com.doopp.aloha.demo.service.impl;

import com.doopp.aloha.demo.service.HelloService;
import com.doopp.aloha.framework.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String hello() {
        return "hello hello";
    }
}
