package com.Google.amazon.service;

import java.util.List;

import com.Google.amazon.dto.OrderDto;

public interface OrderService {
	List<OrderDto> retriveOrders();

	void cancelOrder(Integer productId);
	
	List<OrderDto>  insertOrder(List<OrderDto> orderDto,Integer userId);
}
