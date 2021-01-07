package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Annotation for creating Restful controllers
public class HelloWorldController {

    @GetMapping("/") // Annotation maps HTTP GET requests onto specific handler methods
    public String hello() {
        return "hello world";
    }
}
