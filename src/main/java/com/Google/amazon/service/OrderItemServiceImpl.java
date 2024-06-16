package com.Google.amazon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.OrderItemDto;
import com.Google.amazon.model.OrderItemModel;
import com.Google.amazon.repository.OrderItemRepository;

@Service
public class OrderItemServiceImpl
		implements OrderItemService, DataTransferEntityToDtoService<OrderItemModel, OrderItemDto> {

	@Autowired
	OrderItemRepository orderItemRepository;

	@Override
	public List<OrderItemDto> retriveOrderItem() {

		List<OrderItemModel> orderItemModel = orderItemRepository.findAll();
		List<OrderItemDto> orderItemDto = orderItemModel.stream().map(this::convertEntityToDto)
				.collect(Collectors.toList());

		return orderItemDto;
	}

	@Override
	public OrderItemDto convertEntityToDto(OrderItemModel orderItemEntity) {
		
		OrderItemDto a = new OrderItemDto();
		return new OrderItemDto(orderItemEntity.getOrderItemId(), orderItemEntity.getQuantity(),
				orderItemEntity.getProductModel().getProductId(), orderItemEntity.getOrderModel().getOrderId(),
				orderItemEntity.getPrice());
	}

}
