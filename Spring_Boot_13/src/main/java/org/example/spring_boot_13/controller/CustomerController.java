package org.example.spring_boot_13.controller;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
//property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping("save")
    public boolean saveCustomer(@RequestBody CustomerDTO customerDTO) {
        System.out.println(customerDTO.getName());
        boolean isSaved = customerService.addCustomer(customerDTO);
        return isSaved;
    }
    @GetMapping("getAll")
    public ArrayList<CustomerDTO> getCustomer() {
        return customerService.getAllCustomers();
    }

    @PutMapping("update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.addCustomer(customerDTO);
        return customerDTO.toString();
    }

    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "Customer Deleted with id " + id;
    }
}
