package com.kacperwozniak.product.repository;

import com.kacperwozniak.product.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
