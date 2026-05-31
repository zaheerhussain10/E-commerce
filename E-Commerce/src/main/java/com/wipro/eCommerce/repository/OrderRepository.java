package com.wipro.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.eCommerce.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Integer> {

}
