package com.wipro.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.eCommerce.entity.Customer;

public interface CustomerRepository  extends JpaRepository<Customer, Integer>  {

}
