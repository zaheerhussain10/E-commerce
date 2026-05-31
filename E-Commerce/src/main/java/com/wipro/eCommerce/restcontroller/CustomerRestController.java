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

import com.wipro.eCommerce.entity.Customer;
import com.wipro.eCommerce.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerRestController {

    @Autowired
    ICustomerService service;

    @PostMapping(value="/add", consumes = "application/json")
    public Customer addCustomer(@RequestBody Customer customer) {
        return service.addCustomer(customer);
    }

    @PutMapping("/update")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return service.updateCustomer(customer);
    }

    @GetMapping("/getall")
    public List<Customer> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/getbyid/{id}")
    public Customer getById(@PathVariable int id) {
        return service.getById(id);
    }

    @DeleteMapping("/deletebyid/{id}")
    public String deleteById(@PathVariable int id) {
        service.deleteById(id);
        return "Customer Deleted Successfully";
    }

    @GetMapping("/getbyemail/{email}")
    public Customer getByEmail(@PathVariable String email) {
        return service.getByEmail(email);
    }
}
