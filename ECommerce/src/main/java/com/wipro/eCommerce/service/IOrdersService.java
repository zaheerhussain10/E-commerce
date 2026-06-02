package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.dto.OrdersDTO;
import com.wipro.eCommerce.entity.Orders;

public interface IOrdersService {

    Orders placeOrder(OrdersDTO dto);

    List<Orders> getOrdersByCustomer(int customerId);
}