package com.tulingxueyuan.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sentinel")
public class SentinelController {
    @RequestMapping("hello")
    public void hello(){
        System.out.println("hello");
    }
}
