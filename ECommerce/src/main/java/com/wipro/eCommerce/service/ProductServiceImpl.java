package com.wipro.eCommerce.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.eCommerce.dto.ProductDTO;
import com.wipro.eCommerce.entity.Product;
import com.wipro.eCommerce.mapper.ProductMapper;
import com.wipro.eCommerce.Repository.ProductRepository;

@Service
public class ProductServiceImpl implements IProductService {

    @Autowired
    private ProductRepository repo;

    @Override
    public ProductDTO addProduct(ProductDTO dto) {

        Product p = ProductMapper.toEntity(dto);

        Product saved = repo.save(p);

        return ProductMapper.toDTO(saved);
    }

    @Override
    public List<ProductDTO> getAllProducts() {

        List<Product> list = repo.findAll();
        List<ProductDTO> result = new ArrayList<>();

        for (Product p : list) {
            result.add(ProductMapper.toDTO(p));
        }

        return result;
    }
}