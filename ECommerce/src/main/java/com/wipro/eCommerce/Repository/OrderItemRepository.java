package com.wipro.eCommerce.Repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wipro.eCommerce.entity.OrderItem;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Integer> {

    // Get all items of a specific order
    List<OrderItem> findByOrderOrderId(int orderId);
}