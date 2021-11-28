package com.osp.SpringBootTutorial.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping(value = "/Hello")
    public String helloWorld(){
        return "Hello Worldsss";

    }
}
