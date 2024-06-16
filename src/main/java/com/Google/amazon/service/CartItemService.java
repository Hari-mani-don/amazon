package com.Google.amazon.service;

import java.util.List;

import com.Google.amazon.dto.CartItemDto;

public interface CartItemService {

	List<CartItemDto> fetchCartItem();
}
