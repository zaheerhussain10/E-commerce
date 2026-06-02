package com.wipro.eCommerce.service;

import java.util.List;

import com.wipro.eCommerce.dto.OrderDto;

public interface IOrderService {

    OrderDto placeOrder(OrderDto dto);

    OrderDto getById(Long id);

    List<OrderDto> getAll();
}