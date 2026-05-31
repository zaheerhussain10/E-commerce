package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.entity.Customer;

public interface ICustomerService {

    public Customer addCustomer(Customer customer);

    public Customer updateCustomer(Customer customer);

    public Customer getById(int id);

    public void deleteById(int id);

    public List<Customer> getAllCustomers();

    public Customer getByEmail(String email);
}