package org.example.spring_boot_13.controller;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.service.CustomerService;
import org.example.spring_boot_13.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
//property injection
    @Autowired
    private CustomerService customerService;

    @PostMapping("save")
    public ResponseUtil saveCustomer(@RequestBody CustomerDTO customerDTO) {
        boolean res = customerService.addCustomer(customerDTO);
        if (res) {
            return new ResponseUtil(201, "Customer Added Successfully",null);

        } else {
            return new ResponseUtil(200, "Customer Not Added",null);
        }
    }
    @GetMapping("getAll")
    public ArrayList<CustomerDTO> getCustomer() {
        return customerService.getAllCustomers();
    }

    @PutMapping("update")
    public String updateCustomer(@RequestBody CustomerDTO customerDTO) {
        customerService.addCustomer(customerDTO);
        System.out.println("sdfg");
        return customerDTO.toString();
    }

    @DeleteMapping("delete/{id}")
    public String deleteCustomer(@PathVariable int id) {
        customerService.deleteCustomer(id);
        return "Customer Deleted with id " + id;
    }

    @GetMapping("/getCName/{id}")
    public String getCustomerName(@PathVariable String id){
        return customerService.getCustomerName(Integer.parseInt(id));
    }

}
