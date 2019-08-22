package com.kacperwozniak.product.controller;

import com.kacperwozniak.product.model.Product;
import com.kacperwozniak.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/restapi/product")
public class ProductController {

    @Autowired
    ProductService productService;
    @PostMapping(value = "/createProduct")
    public void createProduct(@RequestBody Product product){
        productService.createProduct(product);
    }

    @GetMapping(value = "/getProducts")
    public List<Product> getProducts(){
        return productService.getAllProducts();
    }
    @GetMapping(value = "/getProduct/{creditId}")
    public Optional<Product> getProduct(@PathVariable("creditId") int creditId){
        return productService.getProductById(creditId);
    }
}
