package com.application.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {
  
    @GetMapping("/") // Annotation maps HTTP GET requests onto specific handler methods
    public String get() {
        return "Hello world";
    }
      @PostMapping("/")
      public String post() {
        return "Hello world";
    }
}
