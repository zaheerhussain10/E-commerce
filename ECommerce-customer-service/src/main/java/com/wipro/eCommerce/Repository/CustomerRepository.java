package com.wipro.eCommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.eCommerce.entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}