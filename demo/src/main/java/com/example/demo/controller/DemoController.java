package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DemoController {

    //localhost:8080/api/vi/Hello
    @GetMapping("/Hello")
    public String getHello() {
        return "Hello World";
    }

    //localhost:8080/api/vi/mgs/welcome
    @GetMapping("/msg/{msg}")
    public String getMsg(@PathVariable String msg) {
        return "msg : "+msg ;
    }

}
