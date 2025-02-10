package org.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("charactar")
public class CharactarMappingController {
    @GetMapping(path = "test1/I???")
    public String test1() {
        return "test1 get mapping Invoke";
    }@GetMapping(path = "????/test2")
    public String test2() {
        return "test 2 get mapping Invoke";
    }
}
