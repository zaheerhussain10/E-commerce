package com.wipro.eCommerce.service;

import java.util.List;

import com.wipro.eCommerce.entity.Product;

	public interface IProductService {

	    public Product addProduct(Product product);

	    public Product updateProduct(Product product);

	    public Product getById(int id);

	    public void deleteById(int id);

	    public List<Product> getAllProducts();

	    public List<Product> getByName(String name);

	    public List<Product> getByPriceGreaterThan(double price);
	}