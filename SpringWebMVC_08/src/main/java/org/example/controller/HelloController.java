package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@Controller
/*
@RestController
*/
@RequestMapping("hello")
public class HelloController {
    public HelloController() {
        System.out.println("HelloController");
    }

    @GetMapping
    public String sayHello(){
        return "index";
    }
    /*@GetMapping("/test1")
    public String sayHello(){
        return "Hello World";
    }
    @GetMapping("/test2")
    public String test(){
        return "Test";
    }*/
}
