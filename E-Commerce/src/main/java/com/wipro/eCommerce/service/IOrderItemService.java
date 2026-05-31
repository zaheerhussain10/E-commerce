package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.entity.OrderItem;

public interface IOrderItemService {

    public OrderItem addItem(OrderItem item);

    public List<OrderItem> getByOrderId(int orderId);

    public void removeItem(int id);
}