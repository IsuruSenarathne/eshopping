package com.bellacore.eshopping.service.Impl;

import com.bellacore.eshopping.entity.Product;
import com.bellacore.eshopping.repository.ProductRepository;
import com.bellacore.eshopping.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductRepository productRepository;

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public Optional<Product> getProduct(Long id) {
        Optional<Product> product = productRepository.findById(id);
        if (product == null){

        }
        return product;
    }

    @Override
    public void updateProduct(Product product) {

    }

    @Override
    public void deleteProduct(Long id) {

    }
}
