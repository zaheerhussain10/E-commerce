package com.wipro.eCommerce.service;

import java.util.List;

import com.wipro.eCommerce.dto.CustomerDto;

public interface ICustomerService {

    CustomerDto create(CustomerDto dto);

    CustomerDto getById(Long id);

    List<CustomerDto> getAll();

    String delete(Long id);
}
