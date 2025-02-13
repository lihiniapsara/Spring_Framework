package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    public boolean addCustomer(CustomerDTO customerDTO) {
        System.out.println("Service Method: "+customerDTO.getName());
        //data save
        return true;
    }
}
