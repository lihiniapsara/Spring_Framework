package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("params")
public class ParamasController {
   // http://localhost:8080/RestController_Web_exploded/params?id=12
    @GetMapping(params = {"id"})
    public String test1( @RequestParam ("id") String id) {
        return "id: " + id ;
    }

    //http://localhost:8080/RestController_Web_exploded/params?id=12 &name=lihini
    @GetMapping(params = {"id","name"})
    public String test2( @RequestParam ("id") String id, @RequestParam("name")  String name) {
        return "id: " + id + " name: " + name;
    }

    @GetMapping(path = "test3" , params = {"id","name"})
    public String test3( @RequestParam ("id") String id, @RequestParam("name")  String name) {
        return "id: " + id + " name: " + name;
    }
}
