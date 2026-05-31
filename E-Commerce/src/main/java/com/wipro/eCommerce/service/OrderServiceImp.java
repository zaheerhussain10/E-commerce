package com.wipro.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.entity.Order;
import com.wipro.eCommerce.repository.OrderRepository;

@Service
public class OrderServiceImp implements IOrderService {

    @Autowired
    OrderRepository repo;

    @Override
    public Order placeOrder(Order order) {
        return repo.save(order);
    }

    @Override
    public Order getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void cancelOrder(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return repo.findAll();
    }

}