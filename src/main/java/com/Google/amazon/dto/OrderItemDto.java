package com.Google.amazon.dto;

public class OrderItemDto {

	private Integer orderItemId;
	private Integer quantity;
	private Integer productId;
	private Integer orderId;
	private Double price;

	public OrderItemDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItemDto(Integer orderItemId, Integer quantity, Integer productId, Integer orderId, Double price) {
		super();
		this.orderItemId = orderItemId;
		this.quantity = quantity;
		this.productId = productId;
		this.orderId = orderId;
		this.price = price;
	}

	public Integer getOrderItemId() {
		return orderItemId;
	}

	public void setOrderItemId(Integer orderItemId) {
		this.orderItemId = orderItemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "OrderItemDto [orderItemId=" + orderItemId + ", quantity=" + quantity + ", productId=" + productId
				+ ", orderId=" + orderId + ", price=" + price + "]";
	}

}
