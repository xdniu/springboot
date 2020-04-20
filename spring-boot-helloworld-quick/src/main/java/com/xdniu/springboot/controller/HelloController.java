package com.xdniu.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String sayHello(){
        System.out.println("say hello");
        System.out.println("hgdkjfsgv");
        return "hello!!！";

    }

}
