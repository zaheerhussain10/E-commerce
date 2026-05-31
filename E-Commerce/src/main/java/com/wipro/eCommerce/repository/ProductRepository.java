package com.wipro.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.eCommerce.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}

