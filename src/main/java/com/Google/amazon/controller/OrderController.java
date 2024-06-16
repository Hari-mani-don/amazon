package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.OrderDto;
import com.Google.amazon.service.OrderService;

@RestController
public class OrderController {

	@Autowired
	OrderService orderService;

	@PostMapping("/users/orders")
	public ResponseEntity<List<OrderDto>> handleRetriveOrders() {

		List<OrderDto> retriveOrders = orderService.retriveOrders();
		return new ResponseEntity<List<OrderDto>>(retriveOrders, HttpStatus.OK);
	}

	@GetMapping("/orders/{orderId}")
	public ResponseEntity<Void> handleCancelOrder(@PathVariable Integer orderId) {

		orderService.cancelOrder(orderId);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

	@PostMapping("/orders/place/{id}")
	public ResponseEntity<List<OrderDto>> handleInsertOrder(@RequestBody List<OrderDto> orderDto,
			@PathVariable(name="id") Integer userId) {
		
		List<OrderDto> insertOrders = orderService.insertOrder(orderDto, userId);
		return new ResponseEntity<List<OrderDto>>(insertOrders, HttpStatus.OK);
	}
}
