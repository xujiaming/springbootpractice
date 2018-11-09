package com.ming.start_practice.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MingController {
    @Value("${my.name}")
    private String name;
    @Value("${my.age}")
    private String age;

    @RequestMapping(value = "/ming", method = {RequestMethod.GET})
    public String ming() {
        return name + "：" + age;
    }
}
