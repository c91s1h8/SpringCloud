package com.sc.ribbon.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sc.ribbon.service.HiService;

@RestController
public class HiController {

    @Resource
    private HiService hiService;
    
    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return hiService.sayHi(name);
    }
}
