package com.wipro.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.entity.Customer;
import com.wipro.eCommerce.repository.CustomerRepository;

@Service
public class CustomerServiceImp implements ICustomerService {

    @Autowired
    CustomerRepository repo;

    @Override
    public Customer addCustomer(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) {
        return repo.save(customer);
    }

    @Override
    public Customer getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Customer> getAllCustomers() {
        return repo.findAll();
    }

	@Override
	public Customer getByEmail(String email) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * @Override public Customer getByEmail(String email) { return
	 * repo.findByEmail(email); }
	 */
}
