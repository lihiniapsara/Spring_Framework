package org.example.spring_boot_13.service;

import org.example.spring_boot_13.dto.CustomerDTO;
import org.example.spring_boot_13.dto.ItemDTO;
import org.example.spring_boot_13.entity.Customer;
import org.example.spring_boot_13.repo.CustomerRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {
    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private CustomerRepo customerRepo;

    //data save
    public boolean addCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            return false;
        }
/*
        Customer customer = new Customer(customerDTO.getId(), customerDTO.getName(), customerDTO.getAddress());
*/
        customerRepo.save(modelMapper.map(customerDTO, Customer.class));
        return true;
    }

    public ArrayList<CustomerDTO> getAllCustomers() {
       /* ArrayList<CustomerDTO> customerDTOS = new ArrayList<>();
        customerRepo.findAll().forEach(customer -> customerDTOS.add(new CustomerDTO(customer.getId(), customer.getName(), customer.getAddress())));
*/
        return modelMapper.map(customerRepo.findAll(), new TypeToken<List<CustomerDTO>>() {
        }.getType());
    }


    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);
    }

    public boolean updateCustomer(CustomerDTO customerDTO) {
        if (customerRepo.existsById(customerDTO.getId())) {
            customerRepo.save(modelMapper.map(customerDTO, Customer.class));
            return true;
        } else {
            return false;
        }
    }

    public List<Long> getAllIds() {
        return customerRepo.findAllIds();
    }

    public String getCustomerName(int id) {
        return customerRepo.getCustomersById(id);
    }
}


