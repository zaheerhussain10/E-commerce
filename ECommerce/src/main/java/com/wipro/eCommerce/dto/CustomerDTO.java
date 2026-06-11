package com.wipro.eCommerce.dto;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

    private Integer customerId;
    private String name;
    private String mobile;
    private String email;
    private String address;
    private String password;
    private String roles;
    private String status;

    
}