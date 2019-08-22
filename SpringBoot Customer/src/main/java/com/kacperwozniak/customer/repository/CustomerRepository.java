package com.kacperwozniak.customer.repository;

import com.kacperwozniak.customer.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {

}
