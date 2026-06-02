package com.wipro.eCommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.eCommerce.dto.OrdersDTO;
import com.wipro.eCommerce.entity.Orders;
import com.wipro.eCommerce.service.IOrdersService;

@RestController
@RequestMapping("/api/orders")
public class OrdersController {

    @Autowired
    private IOrdersService service;

    // ✅ Accept DTO (important)
    @PostMapping("/place")
    public Orders placeOrder(@RequestBody OrdersDTO dto) {
        return service.placeOrder(dto);
    }

    @GetMapping("/customer/{id}")
    public List<Orders> getOrdersByCustomer(@PathVariable int id) {
        return service.getOrdersByCustomer(id);
    }
}