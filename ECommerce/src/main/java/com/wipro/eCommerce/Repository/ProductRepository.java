package com.wipro.eCommerce.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.eCommerce.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

    // Find product by name
    Product findByProductName(String productName);
}