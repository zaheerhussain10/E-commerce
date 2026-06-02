package com.wipro.eCommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.dto.CustomerDTO;
import com.wipro.eCommerce.entity.Customer;
import com.wipro.eCommerce.mapper.CustomerMapper;
import com.wipro.eCommerce.Repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements ICustomerService {

    @Autowired
    private CustomerRepository repo;

    @Override
    public CustomerDTO addCustomer(CustomerDTO dto) {

        Customer c = CustomerMapper.toEntity(dto);

        Customer saved = repo.save(c);

        return CustomerMapper.toDTO(saved);
    }

    @Override
    public List<CustomerDTO> getAllCustomers() {

        List<Customer> list = repo.findAll();
        List<CustomerDTO> result = new ArrayList<>();

        for (Customer c : list) {
            result.add(CustomerMapper.toDTO(c));
        }

        return result;
    }

    @Override
    public CustomerDTO getCustomerById(int id) {

        Customer c = repo.findById(id).orElse(null);

        if (c == null) return null;

        return CustomerMapper.toDTO(c);
    }
}