
package com.wipro.eCommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.wipro.eCommerce.Repository.ProductRepository;
import com.wipro.eCommerce.dto.ProductDto;
import com.wipro.eCommerce.entity.Product;
import com.wipro.eCommerce.mapper.ProductMapper;

import lombok.RequiredArgsConstructor;


@Service
@RequiredArgsConstructor   // constructor injection ✅
public class ProductServiceImpl implements IProductService {

    private final ProductRepository repo;

    @Override
    public ProductDto create(ProductDto dto) {
        Product product = ProductMapper.toEntity(dto);
        product = repo.save(product);
        return ProductMapper.toDto(product);
    }


    @Override
    public ProductDto getById(Long id) {
        Product p = repo.findById(id).orElseThrow();
        return ProductMapper.toDto(p);
    }

    @Override
    public List<ProductDto> getAll() {
        return repo.findAll()
                .stream()
                .map(ProductMapper::toDto)
                .collect(Collectors.toList());
    }
    

    @Override
    public String delete(Long id) {
        repo.deleteById(id);
        return "Product deleted";
    }
}