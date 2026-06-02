package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.dto.CustomerDTO;

public interface ICustomerService {

    CustomerDTO addCustomer(CustomerDTO dto);

    List<CustomerDTO> getAllCustomers();

    CustomerDTO getCustomerById(int id);
}