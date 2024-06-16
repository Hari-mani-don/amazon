package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.OrderItemDto;
import com.Google.amazon.service.OrderItemService;

@RestController
public class OrderItemController {

	@Autowired
	OrderItemService orderItemService;

	@PostMapping("/users/orders/order_items")
	public ResponseEntity<List<OrderItemDto>> handelRetriveOrderItem() {

		List<OrderItemDto> retriveOrderItem = orderItemService.retriveOrderItem();
		return new ResponseEntity<List<OrderItemDto>>(retriveOrderItem, HttpStatus.OK);
	}
}
