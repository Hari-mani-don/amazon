package com.Google.amazon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.CartItemDto;
import com.Google.amazon.model.CartItemModel;
import com.Google.amazon.repository.CartItemRepository;

@Service
public class CartItemServiceImpl
		implements CartItemService, DataTransferEntityToDtoService<CartItemModel, CartItemDto> {

	@Autowired
	CartItemRepository cartItemRepository;

	@Override
	public List<CartItemDto> fetchCartItem() {

		List<CartItemModel> cartItemModel = cartItemRepository.findAll();
		List<CartItemDto> cartItemDto = cartItemModel.stream().map(this::convertEntityToDto)
				.collect(Collectors.toList());

		return cartItemDto;
	}

	@Override
	public CartItemDto convertEntityToDto(CartItemModel cartItemEntity) {

		return new CartItemDto(cartItemEntity.getCartItemId(), cartItemEntity.getQuantity(),
				cartItemEntity.getUser().getUserId(), cartItemEntity.getProductModel().getProductId());
	}

}
