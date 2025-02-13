package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.entity.Customer;
import org.example.spring_boot_13.repo.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

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

    public ArrayList<CustomerDTO> getAllCustomers() {
        ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerRepo.findAll().forEach(customer -> customerDTOS.add(new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress())));
        return customerDTOS;
    }

    public void updateCustomer(CustomerDTO customerDTO) {
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
        customerRepo.save(customer);
    }

    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }
}
