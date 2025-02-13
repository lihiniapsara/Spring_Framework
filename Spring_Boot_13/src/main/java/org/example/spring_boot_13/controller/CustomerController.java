package org.example.spring_boot_13.controller;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
//property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping("save")
    public String saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getName());
        customerService.addCustomer(customerDTO);
        return customerDTO.toString();
    }
}
