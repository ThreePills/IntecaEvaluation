package com.kacperwozniak.customer.service;

import com.kacperwozniak.customer.model.Customer;
import com.kacperwozniak.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class CustomerService implements ICustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> getCustomer(int creditId) {
        return customerRepository.findById(creditId);
    }

    @Override
    public void createCustomer(Customer customer) {
        customerRepository.save(customer);

    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepository.findAll();
    }
}
