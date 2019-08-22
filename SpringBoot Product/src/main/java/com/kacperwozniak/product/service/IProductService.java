package com.kacperwozniak.product.service;

import com.kacperwozniak.product.model.Product;
import com.kacperwozniak.product.repository.ProductRepository;

import java.util.List;
import java.util.Optional;

public interface IProductService {
    public Optional<Product> getProductById(int creditID);
    public List<Product> getAllProducts();
    public void createProduct(Product product);
}
