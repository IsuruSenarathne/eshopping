package com.bellacore.eshopping.repository;

import com.bellacore.eshopping.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
