package org.example.spring_sequrity_14;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private List<Customer> customers=new ArrayList<Customer>(
            List.of(new Customer(1,"A"),new Customer(2,"B"),new Customer(3,"C"))
    );
    @GetMapping
    public List<Customer> getCustomers(){
        return customers;
    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        customers.add(customer);
    }

    @GetMapping("csrf" )
    public CsrfToken csrf(HttpServletRequest request) {
            return (CsrfToken) request.getAttribute("csrfToken");

    }
}
