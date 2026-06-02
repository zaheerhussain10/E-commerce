package com.wipro.eCommerce.mapper;

import com.wipro.eCommerce.dto.ProductDto;
import com.wipro.eCommerce.entity.Product;

public class ProductMapper {

    public static ProductDto toDto(Product p) {
        return new ProductDto(
                p.getId(),
                p.getName(),
                p.getPrice(),
                p.getQuantity()
        );
    }

    public static Product toEntity(ProductDto dto) {
        return new Product(
                dto.getId(),
                dto.getName(),
                dto.getPrice(),
                dto.getQuantity()
        );
    }
}
