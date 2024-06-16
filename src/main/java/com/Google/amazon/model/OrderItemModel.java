package com.Google.amazon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class OrderItemModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer orderItemId;
	private Integer quantity;
	private Double price;
//	order_id (Foreign Key to Order)
//	product_id (Foreign Key to Product)

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	@JsonIgnore
	private ProductModel productModel;

	@ManyToOne
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	@JsonIgnore
	private OrderModel orderModel;

	public OrderItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderItemModel(Integer orderItemId, Integer quantity, Double price, ProductModel productModel,
			OrderModel orderModel) {
		super();
		this.orderItemId = orderItemId;
		this.quantity = quantity;
		this.price = price;
		this.productModel = productModel;
		this.orderModel = orderModel;
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

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	public OrderModel getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel) {
		this.orderModel = orderModel;
	}

	@Override
	public String toString() {
		return "OrderItemModel [orderItemId=" + orderItemId + ", quantity=" + quantity + ", price=" + price
				+ ", productModel=" + productModel + ", orderModel=" + orderModel + "]";
	}

}
