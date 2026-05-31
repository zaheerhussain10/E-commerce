package com.wipro.eCommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.wipro.eCommerce.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Integer>  {

}
