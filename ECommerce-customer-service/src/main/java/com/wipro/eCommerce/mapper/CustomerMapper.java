package com.wipro.eCommerce.mapper;

import com.wipro.eCommerce.dto.CustomerDto;
import com.wipro.eCommerce.entity.Customer;

public class CustomerMapper {

    public static CustomerDto toDto(Customer c) {
        return new CustomerDto(
                c.getId(),
                c.getName(),
                c.getEmail(),
                c.getMobile()
        );
    }

    public static Customer toEntity(CustomerDto dto) {
        return new Customer(
                dto.getId(),
                dto.getName(),
                dto.getEmail(),
                dto.getMobile()
        );
    }
}