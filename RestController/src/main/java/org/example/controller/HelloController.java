package org.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@RestController

@RequestMapping("hello")
public class HelloController {


    @GetMapping
    public String sayHello(){
        return "get mapping Invoke";
    }
    @PostMapping
    public String sayHelloPost(){
        return "post mapping Invoke";
    }

    @PutMapping
    public String sayHelloPut(){
        return "put mapping Invoke";
    }

    @DeleteMapping
    public String sayHelloDelete(){
        return "delete mapping Invoke";
    }
    @PatchMapping
    public String sayHelloPatch(){
        return "patch mapping Invoke";
    }
}
