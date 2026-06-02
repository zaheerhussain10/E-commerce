package com.wipro.eCommerce.mapper;

import com.wipro.eCommerce.dto.CustomerDTO;
import com.wipro.eCommerce.entity.Customer;

public class CustomerMapper {

    // DTO → Entity
    public static Customer toEntity(CustomerDTO dto) {

        Customer c = new Customer();

        c.setCustomerId(dto.getCustomerId());
        c.setName(dto.getName());
        c.setEmail(dto.getEmail());
        c.setMobile(dto.getMobile());
        c.setAddress(dto.getAddress());
        c.setStatus("ACTIVE");

        return c;
    }

    // Entity → DTO
    public static CustomerDTO toDTO(Customer c) {

        CustomerDTO dto = new CustomerDTO();

        dto.setCustomerId(c.getCustomerId());
        dto.setName(c.getName());
        dto.setEmail(c.getEmail());
        dto.setMobile(c.getMobile());
        dto.setAddress(c.getAddress());

        return dto;
    }
}