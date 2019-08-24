package com.kacperwozniak.product.service;

import com.kacperwozniak.product.model.Product;
import com.kacperwozniak.product.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    Optional<Product> getProductById(int creditID);
    List<Product> getAllProducts();
    void createProduct(Product product);
}
