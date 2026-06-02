package com.wipro.eCommerce.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.dto.OrdersDTO;
import com.wipro.eCommerce.entity.OrderItem;
import com.wipro.eCommerce.entity.Orders;
import com.wipro.eCommerce.entity.Product;
import com.wipro.eCommerce.mapper.OrdersMapper;
import com.wipro.eCommerce.Repository.OrdersRepository;
import com.wipro.eCommerce.Repository.ProductRepository;

@Service
public class OrdersServiceImpl implements IOrdersService {

    @Autowired
    private OrdersRepository ordersRepo;

    @Autowired
    private ProductRepository productRepo;

    @Override
    public Orders placeOrder(OrdersDTO dto) {

        // ✅ Convert DTO → Entity
        Orders order = OrdersMapper.toEntity(dto);

        order.setOrderDate(LocalDate.now());

        double total = 0;

        for (OrderItem item : order.getItems()) {

            Product p = productRepo
                    .findById(item.getProduct().getProductId())
                    .orElse(null);

            if (p != null) {

                // reduce stock
                p.setQuantity(p.getQuantity() - item.getQuantity());
                productRepo.save(p);

                // set price
                item.setPrice(p.getPrice());

                item.setOrder(order);

                total += item.getQuantity() * p.getPrice();
            }
        }

        order.setTotalAmount(total);

        return ordersRepo.save(order);
    }

    @Override
    public List<Orders> getOrdersByCustomer(int customerId) {
        return ordersRepo.findByCustomerCustomerId(customerId);
    }
}