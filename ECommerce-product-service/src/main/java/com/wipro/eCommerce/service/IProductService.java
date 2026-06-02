package com.wipro.eCommerce.service;

import java.util.List;

import com.wipro.eCommerce.dto.ProductDto;

public interface IProductService {

    ProductDto create(ProductDto dto);

    ProductDto getById(Long id);

    List<ProductDto> getAll();

    String delete(Long id);
}
