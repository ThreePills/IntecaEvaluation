package com.kacperwozniak.product.service;

import com.kacperwozniak.product.model.Product;
import com.kacperwozniak.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService implements IProductService {

    @Autowired
    ProductRepository productRepository;


    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }
    @Override
    public Optional<Product> getProductById(int creditID){
        return productRepository.findById(creditID);
    }

    @Override
    public void createProduct(Product product) {
        productRepository.save(product);

    }
}
