package com.wipro.eCommerce.entity;


import java.util.List;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int customerId;

    private String name;
    private String mobile;
    private String email;
    private String address;

    private String status;

    // One customer can place multiple orders
    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;
}