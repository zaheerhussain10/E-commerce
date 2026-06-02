package com.wipro.eCommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wipro.eCommerce.Repository.CustomerRepository;
import com.wipro.eCommerce.dto.CustomerDto;
import com.wipro.eCommerce.entity.Customer;
import com.wipro.eCommerce.mapper.CustomerMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class CustomerServiceImpl implements ICustomerService {

    private final CustomerRepository repo;

    @Override
    public CustomerDto create(CustomerDto dto) {
        Customer c = CustomerMapper.toEntity(dto);
        c = repo.save(c);
        return CustomerMapper.toDto(c);
    }

    @Override
    public CustomerDto getById(Long id) {
        Customer c = repo.findById(id).orElseThrow();
        return CustomerMapper.toDto(c);
    }

    @Override
    public List<CustomerDto> getAll() {
        return repo.findAll()
                .stream()
                .map(CustomerMapper::toDto)
                .collect(Collectors.toList());
    }

    @Override
    public String delete(Long id) {
        repo.deleteById(id);
        return "Customer deleted";
    }
}
