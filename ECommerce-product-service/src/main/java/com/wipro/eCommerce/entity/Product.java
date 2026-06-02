package com.wipro.eCommerce.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Data                  // getter + setter
@NoArgsConstructor     // no-arg constructor
@AllArgsConstructor    // all-arg constructor
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;
    private int quantity;
}