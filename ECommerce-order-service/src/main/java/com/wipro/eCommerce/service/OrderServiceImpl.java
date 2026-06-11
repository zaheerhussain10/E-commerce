package com.wipro.eCommerce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.wipro.eCommerce.Repository.OrderRepository;
import com.wipro.eCommerce.dto.OrderDto;
import com.wipro.eCommerce.entity.Order;
import com.wipro.eCommerce.mapper.OrderMapper;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class OrderServiceImpl implements IOrderService {

	private final OrderRepository repo;
	private final RestTemplate restTemplate;

	@Override
	public OrderDto placeOrder(OrderDto dto) {

		
	String customerUrl = "http://ECOMMERCE-CUSTOMER-SERVICE/customers/" + dto.getCustomerId();
	String productUrl = "http://ECOMMERCE-PRODUCT-SERVICE/products/" + dto.getProductId();
		  
		 

		double price = 100; // you can extract from product later
		dto.setTotalPrice(price * dto.getQuantity());

		Order order = OrderMapper.toEntity(dto);
		order = repo.save(order);

		return OrderMapper.toDto(order);
	}

	@Override
	public OrderDto getById(Long id) {
		Order o = repo.findById(id).orElseThrow();
		return OrderMapper.toDto(o);
	}

	@Override
	public List<OrderDto> getAll() {
		return repo.findAll().stream().map(OrderMapper::toDto).collect(Collectors.toList());
	}
}