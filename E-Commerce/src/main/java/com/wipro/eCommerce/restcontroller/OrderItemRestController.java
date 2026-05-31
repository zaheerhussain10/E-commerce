package com.wipro.eCommerce.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.eCommerce.entity.OrderItem;
import com.wipro.eCommerce.service.IOrderItemService;

@RestController
@RequestMapping("/api/orderitems")
public class OrderItemRestController {

    @Autowired
    IOrderItemService service;

    @PostMapping("/add")
    public OrderItem addItem(@RequestBody OrderItem item) {
        return service.addItem(item);
    }

    @GetMapping("/getbyorder/{orderId}")
    public List<OrderItem> getByOrderId(@PathVariable int orderId) {
        return service.getByOrderId(orderId);
    }

    @DeleteMapping("/delete/{id}")
    public String removeItem(@PathVariable int id) {
        service.removeItem(id);
        return "Item Removed Successfully";
    }
}