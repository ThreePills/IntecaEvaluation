package com.kacperwozniak.customer.service;

import com.kacperwozniak.customer.model.Customer;

import java.util.List;
import java.util.Optional;

public interface ICustomerService {
    public Optional<Customer> getCustomer(int creditId);
    public void createCustomer(Customer customer);
    public List<Customer> getCustomers();
}
