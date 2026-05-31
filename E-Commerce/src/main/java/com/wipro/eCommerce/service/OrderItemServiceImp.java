package com.wipro.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.entity.OrderItem;
import com.wipro.eCommerce.repository.OrderItemRepository;

@Service
public class OrderItemServiceImp implements IOrderItemService {

    @Autowired
    OrderItemRepository repo;

    @Override
    public OrderItem addItem(OrderItem item) {
        return repo.save(item);
    }
	/*
	 * @Override public List<OrderItem> getByOrderId(int orderId) { return
	 * repo.findByOrderId(orderId); }
	 */

    @Override
    public void removeItem(int id) {
        repo.deleteById(id);
    }
	@Override
	public List<OrderItem> getByOrderId(int orderId) {
		// TODO Auto-generated method stub
		return null;
	}
}
