package xyz.xiashuo.dockersimple.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/Hello")
public class HelloController {

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "Hello, Spring Boot 2! 就是这么神奇吗！";
    }

}