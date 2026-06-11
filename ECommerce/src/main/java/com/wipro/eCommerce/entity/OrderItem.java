package com.wipro.eCommerce.entity;


import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer orderItemId;

    private Integer quantity;
    private Double price;

    // Many items belong to one order
    @ManyToOne
    @JoinColumn(name = "order_id")
    private Orders order;

    // Many items refer to one product
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;
}
