package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping( "wildcard")
public class WildCardMappingController {
    @GetMapping(path = "test1/*")
    public String test1(){
        return "Get Mapping1 Invoke";
    }
}
