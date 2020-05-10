package com.bellacore.eshopping.service;

import com.bellacore.eshopping.entity.Product;

import java.util.List;
import java.util.Optional;

public interface ProductService {
    public List<Product> getAllProducts();

    public Optional<Product> getProduct(Long id);

    public void updateProduct(Product product);

    public void deleteProduct(Long id);
}
