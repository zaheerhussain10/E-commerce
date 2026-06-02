package com.wipro.eCommerce.mapper;


import java.util.ArrayList;
import java.util.List;

import com.wipro.eCommerce.dto.OrderItemDTO;
import com.wipro.eCommerce.dto.OrdersDTO;
import com.wipro.eCommerce.entity.Customer;
import com.wipro.eCommerce.entity.OrderItem;
import com.wipro.eCommerce.entity.Orders;
import com.wipro.eCommerce.entity.Product;

public class OrdersMapper {

    // DTO → Entity
    public static Orders toEntity(OrdersDTO dto) {

        Orders order = new Orders();

        // ✅ set customer
        Customer c = new Customer();
        c.setCustomerId(dto.getCustomerId());
        order.setCustomer(c);

        List<OrderItem> items = new ArrayList<>();

        for (OrderItemDTO itemDTO : dto.getItems()) {

            OrderItem item = new OrderItem();

            // set product using id
            Product p = new Product();
            p.setProductId(itemDTO.getProductId());

            item.setProduct(p);
            item.setQuantity(itemDTO.getQuantity());

            // link order
            item.setOrder(order);

            items.add(item);
        }

        order.setItems(items);

        return order;
    }
}
