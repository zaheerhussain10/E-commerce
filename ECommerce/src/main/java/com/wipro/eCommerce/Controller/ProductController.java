package com.wipro.eCommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.wipro.eCommerce.dto.ProductDTO;
import com.wipro.eCommerce.service.IProductService;

@RestController
@RequestMapping("/api/products")
public class ProductController {

    @Autowired
    private IProductService service;

    @PostMapping("/add")
    public ProductDTO addProduct(@RequestBody ProductDTO dto) {
        return service.addProduct(dto);
    }

    @GetMapping("/all")
    public List<ProductDTO> getAllProducts() {
        return service.getAllProducts();
    }
}