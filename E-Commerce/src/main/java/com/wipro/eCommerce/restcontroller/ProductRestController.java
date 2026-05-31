package com.wipro.eCommerce.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wipro.eCommerce.entity.Product;
import com.wipro.eCommerce.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductRestController {

    @Autowired
    IProductService service;

    @PostMapping("/add")
    public Product addProduct(@RequestBody Product product) {
        return service.addProduct(product);
    }

    @PutMapping("/update")
    public Product updateProduct(@RequestBody Product product) {
        return service.updateProduct(product);
    }

    @GetMapping("/getall")
    public List<Product> getAllProducts() {
        return service.getAllProducts();
    }

    @GetMapping("/getbyid/{id}")
    public Product getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable int id) {
        service.deleteById(id);
        return "Product Deleted Successfully";
    }

    @GetMapping("/getbyname/{name}")
    public List<Product> getByName(@PathVariable String name) {
        return service.getByName(name);
    }

    @GetMapping("/getbypricegt/{price}")
    public List<Product> getByPriceGT(@PathVariable double price) {
        return service.getByPriceGreaterThan(price);
    }
}