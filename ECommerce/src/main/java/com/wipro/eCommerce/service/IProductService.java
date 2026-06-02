package com.wipro.eCommerce.service;

import java.util.List;
import com.wipro.eCommerce.dto.ProductDTO;

public interface IProductService {

    ProductDTO addProduct(ProductDTO dto);

    List<ProductDTO> getAllProducts();
}