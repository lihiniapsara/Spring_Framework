package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.entity.Customer;
import org.example.spring_boot_13.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;
    //data save
    public boolean addCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
        customerRepo.save(customer);
        return true;
    }
}
