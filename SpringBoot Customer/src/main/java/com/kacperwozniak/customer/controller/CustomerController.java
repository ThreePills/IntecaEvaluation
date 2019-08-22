package com.kacperwozniak.customer.controller;

import com.kacperwozniak.customer.model.Customer;
import com.kacperwozniak.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "/restapi/customer")
public class CustomerController {

    @Autowired
    CustomerService customerService;

    @GetMapping(value = "/getCustomer/{creditId}")
    public Optional<Customer> getCustomer(@PathVariable("creditId") int creditId){
        return customerService.getCustomer(creditId);
    }
    @GetMapping(value = "/getCustomers")
    public List<Customer> getCustomers(){
        return customerService.getCustomers();
    }
    @PostMapping(value = "/createCustomer")
    public void createCustomer(@RequestBody Customer customer){
        customerService.createCustomer(customer);
    }
}
