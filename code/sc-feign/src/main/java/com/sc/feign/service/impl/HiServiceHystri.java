package com.sc.feign.service.impl;

import org.springframework.stereotype.Component;

import com.sc.feign.service.HiService;

@Component
public class HiServiceHystri implements HiService {

    @Override
    public String sayHi(String name) {
        return "sorry "+name;
    }

}
