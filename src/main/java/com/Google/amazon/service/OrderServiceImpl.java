package com.Google.amazon.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.OrderDto;
import com.Google.amazon.model.OrderModel;
import com.Google.amazon.model.UserModel;
import com.Google.amazon.repository.OrderRepository;
import com.Google.amazon.repository.UserRepository;

@Service
public class OrderServiceImpl implements OrderService, DataTransferEntityToDtoService<OrderModel, OrderDto> {

	@Autowired
	OrderRepository orderRepository;

	@Autowired
	UserRepository userRepository;

	@Override
	public List<OrderDto> retriveOrders() {

		List<OrderModel> orderModel = orderRepository.findAll();
		List<OrderDto> orderDto = orderModel.stream().map(this::convertEntityToDto).collect(Collectors.toList());

		return orderDto;
	}

	@Override
	public void cancelOrder(Integer productId) {

		return;
	}

	@Override
	public OrderDto convertEntityToDto(OrderModel orderEntity) {

		return new OrderDto(orderEntity.getOrderId(), orderEntity.getOrderDate(), orderEntity.getUser().getUserId(),
				orderEntity.getOrderItemModel(), orderEntity.getPaymentModel());
	}

	@Override
	public List<OrderDto> insertOrder(List<OrderDto> orderDto, Integer userId) {

		UserModel userModel = new UserModel();
		userModel.setUserId(userId);

		List<OrderModel> orderList = new ArrayList<>();
		for (OrderDto order : orderDto) {
			OrderModel orderModel = new OrderModel();
			orderModel.setOrderId(order.getOrderId());
			orderModel.setOrderDate(order.getOrderDate());
			orderModel.setOrderItemModel(order.getOrderItemModel());
			orderModel.setPaymentModel(order.getPaymentModel());
			orderList.add(orderModel);

		}
		userModel.setOrders(orderList);

		UserModel retriveUser = userRepository.findByUserId(userModel.getUserId());
		retriveUser.setOrders(userModel.getOrders());

		UserModel savedUser = userRepository.save(retriveUser);

		List<OrderDto> orderDtoList = new ArrayList<>();

		for (OrderModel orderModel : savedUser.getOrders()) {
			OrderDto orderEntityToDto = new OrderDto();
			orderEntityToDto.setOrderDate(orderModel.getOrderDate());
			orderEntityToDto.setOrderId(orderModel.getOrderId());
//			orderEntityToDto.setUserId(orderModel.getUser().getUserId());
			orderEntityToDto.setOrderItemModel(orderModel.getOrderItemModel());

			orderDtoList.add(orderEntityToDto);
		}

		return orderDtoList;
	}

}
