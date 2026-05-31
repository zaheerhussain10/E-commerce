package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.entity.Order;

public interface IOrderService {

    public Order placeOrder(Order order);

    public Order getById(int id);

    public void cancelOrder(int id);

    public List<Order> getAllOrders();
}
