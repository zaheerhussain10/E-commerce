package com.wipro.eCommerce.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.eCommerce.entity.Orders;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Integer> {

    // Get all orders of a specific customer
    List<Orders> findByCustomerCustomerId(int customerId);
}