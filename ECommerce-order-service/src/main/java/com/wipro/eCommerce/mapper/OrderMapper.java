package com.wipro.eCommerce.mapper;

import com.wipro.eCommerce.dto.OrderDto;
import com.wipro.eCommerce.entity.Order;

public class OrderMapper {

    public static OrderDto toDto(Order o) {
        return new OrderDto(
                o.getId(),
                o.getCustomerId(),
                o.getProductId(),
                o.getQuantity(),
                o.getTotalPrice()
        );
    }

    public static Order toEntity(OrderDto dto) {
        return new Order(
                dto.getId(),
                dto.getCustomerId(),
                dto.getProductId(),
                dto.getQuantity(),
                dto.getTotalPrice()
        );
    }
}