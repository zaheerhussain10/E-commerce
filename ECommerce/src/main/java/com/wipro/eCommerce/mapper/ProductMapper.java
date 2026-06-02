package com.wipro.eCommerce.mapper;


import com.wipro.eCommerce.dto.ProductDTO;
import com.wipro.eCommerce.entity.Product;

public class ProductMapper {

    // DTO → Entity
    public static Product toEntity(ProductDTO dto) {

        Product p = new Product();

        p.setProductId(dto.getProductId());
        p.setProductName(dto.getProductName());
        p.setPrice(dto.getPrice());
        p.setQuantity(dto.getQuantity());
        p.setCategory(dto.getCategory());
        p.setStatus("AVAILABLE");

        return p;
    }

    // Entity → DTO
    public static ProductDTO toDTO(Product p) {

        ProductDTO dto = new ProductDTO();

        dto.setProductId(p.getProductId());
        dto.setProductName(p.getProductName());
        dto.setPrice(p.getPrice());
        dto.setQuantity(p.getQuantity());
        dto.setCategory(p.getCategory());

        return dto;
    }
}