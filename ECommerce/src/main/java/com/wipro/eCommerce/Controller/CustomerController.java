package com.wipro.eCommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.wipro.eCommerce.dto.CustomerDTO;
import com.wipro.eCommerce.service.ICustomerService;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private ICustomerService service;

    @PostMapping("/add")
    public CustomerDTO addCustomer(@RequestBody CustomerDTO dto) {
        return service.addCustomer(dto);
    }

    @GetMapping("/all")
    @PreAuthorize("hasAuthority('ADMIN')")
    public List<CustomerDTO> getAllCustomers() {
        return service.getAllCustomers();
    }

    @GetMapping("/{id}")
    @PreAuthorize("hasAuthority('USER')")
    public CustomerDTO getCustomerById(@PathVariable int id) {
        return service.getCustomerById(id);
    }
}
