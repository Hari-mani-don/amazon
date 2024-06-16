package com.Google.amazon.dto;

import java.util.List;

import com.Google.amazon.model.OrderItemModel;
import com.Google.amazon.model.PaymentModel;

public class OrderDto {

	private Integer orderId;
	private Integer orderDate;
	private Integer userId;

	private List<OrderItemModel> orderItemModel;

	private PaymentModel PaymentModel;

	public OrderDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderDto(Integer orderId, Integer orderDate, Integer userId, List<OrderItemModel> orderItemModel,
			com.Google.amazon.model.PaymentModel paymentModel) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.userId = userId;
		this.orderItemModel = orderItemModel;
		PaymentModel = paymentModel;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Integer getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Integer orderDate) {
		this.orderDate = orderDate;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public List<OrderItemModel> getOrderItemModel() {
		return orderItemModel;
	}

	public void setOrderItemModel(List<OrderItemModel> orderItemModel) {
		this.orderItemModel = orderItemModel;
	}

	public PaymentModel getPaymentModel() {
		return PaymentModel;
	}

	public void setPaymentModel(PaymentModel paymentModel) {
		PaymentModel = paymentModel;
	}

	@Override
	public String toString() {
		return "OrderDto [orderId=" + orderId + ", orderDate=" + orderDate + ", userId=" + userId + ", orderItemModel="
				+ orderItemModel + ", PaymentModel=" + PaymentModel + "]";
	}

}
