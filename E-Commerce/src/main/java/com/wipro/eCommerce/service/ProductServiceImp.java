package com.wipro.eCommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.entity.Product;
import com.wipro.eCommerce.repository.ProductRepository;

@Service
public class ProductServiceImp implements IProductService {

    @Autowired
    ProductRepository repo;

    @Override
    public Product addProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product updateProduct(Product product) {
        return repo.save(product);
    }

    @Override
    public Product getById(int id) {
        return repo.findById(id).orElse(null);
    }

    @Override
    public void deleteById(int id) {
        repo.deleteById(id);
    }

    @Override
    public List<Product> getAllProducts() {
        return repo.findAll();
    }

	@Override
	public List<Product> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getByPriceGreaterThan(double price) {
		// TODO Auto-generated method stub
		return null;
	}

	
	/*
	 * @Override public List<Product> getByName(String name) { return
	 * repo.findByName(name); }
	 * 
	 * @Override public List<Product> getByPriceGreaterThan(double price) { return
	 * repo.findByPriceGreaterThan(price); }
	 */
	 
}
