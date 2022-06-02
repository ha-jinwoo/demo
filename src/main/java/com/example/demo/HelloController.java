package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "Hello Aurora3~!!!";
    }

    @GetMapping("/hello2")
    public String hello2() {
        return "Hi jenkins";
    }

    @GetMapping("/hello3")
    public String hello3() {
        return "Hello3";
    }
    @GetMapping("/hello4")
    public String hello4() {
        return "Hello4";
    }

    @GetMapping("/hello5")
    public String hello5() {
        return "Hello5";
    }
}
