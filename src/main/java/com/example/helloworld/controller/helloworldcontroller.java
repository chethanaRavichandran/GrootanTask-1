package com.example.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloWorldController {
  
    @GetMapping("/") // Annotation maps HTTP GET requests onto specific handler methods
    public String hello() {
        return "Hello world";
    }
      @PostMapping("/")
      public String hello() {
        return "Hello world";
    }
}
