package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("json")
public class JSONController {
    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,produces = MediaType.APPLICATION_JSON_VALUE)
    public int test1(@RequestBody CustomerDTO customerDTO){
        return customerDTO.getAge();

    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public CustomerDTO test2(@RequestBody CustomerDTO customerDTO){
        return new CustomerDTO("Lihini","Perera",22);
    }

    @GetMapping(path = "getAll",produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<CustomerDTO> test3(){
     ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
     customerDTOS.add(new CustomerDTO("Lihini","Perera",22));
     customerDTOS.add(new CustomerDTO("Lihini","Perera",12));
     customerDTOS.add(new CustomerDTO("Lihini","Perera",32));
     return customerDTOS;
    }
}
