package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.CartItemDto;
import com.Google.amazon.service.CartItemService;

@RestController
public class CartItemController {
	@Autowired
	CartItemService cartItemService;

	@PostMapping("/users/cart_items")
	public ResponseEntity<List<CartItemDto>> handleFetchCartItem() {

		List<CartItemDto> fetchCartItem = cartItemService.fetchCartItem();
		return new ResponseEntity<List<CartItemDto>>(fetchCartItem, HttpStatus.OK);
	}

}
