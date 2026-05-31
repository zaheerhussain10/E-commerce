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

import com.wipro.eCommerce.entity.Order;
import com.wipro.eCommerce.service.IOrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderRestController {

    @Autowired
    IOrderService service;

    @PostMapping("/add")
    public Order placeOrder(@RequestBody Order order) {
        return service.placeOrder(order);
    }

    @GetMapping("/getall")
    public List<Order> getAllOrders() {
        return service.getAllOrders();
    }

    @GetMapping("/getbyid/{id}")
    public Order getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteOrder(@PathVariable int id) {
        service.cancelOrder(id);
        return "Order Cancelled Successfully";
    }
}
