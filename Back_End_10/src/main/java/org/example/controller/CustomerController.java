package org.example.controller;

import org.example.dto.CustomerDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("api/v1/customer")
public class CustomerController {
    private ArrayList<CustomerDTO> customers = new ArrayList<>();


    @GetMapping(path = "getAll")
    public ArrayList<CustomerDTO> getAllCustomers(){
        return customers;
    }
    @PostMapping("save")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO customerDTO){
        customers.add(customerDTO);
        return customerDTO;
    }

    @PutMapping("update")
    public CustomerDTO updateCustomer(@RequestBody CustomerDTO customerDTO) {

        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO existingCustomer = customers.get(i);
            if (existingCustomer.getId().equals(customerDTO.getId())) {
                existingCustomer.setName(customerDTO.getName());
                existingCustomer.setAddress(customerDTO.getAddress());
                return existingCustomer;
            }
        }

        return customerDTO;
    }
    @DeleteMapping("delete/{id}")
    public boolean deleteCustomer(@PathVariable ("id") String id) {
        System.out.println(id+"    c id");

        for (int i = 0; i < customers.size(); i++) {
            CustomerDTO existingCustomer = customers.get(i);
            if (existingCustomer.getId().equals(id)) {
                customers.remove(i);
                return true;
            }

        }
        return false;
    }
    @PatchMapping("patch")
    public String sayHelloPatch(){
        return "Customer";
    }
}
