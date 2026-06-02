package com.wipro.eCommerce.dto;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private Long id;
    private Long customerId;
    private Long productId;
    private int quantity;
    private double totalPrice;
}