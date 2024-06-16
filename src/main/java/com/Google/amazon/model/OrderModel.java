package com.Google.amazon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class OrderModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "order_id")
	private Integer orderId;
	private Integer orderDate;

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@JsonIgnore
	private UserModel user;

	@OneToMany(mappedBy = "orderModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OrderItemModel> orderItemModel;

	@OneToOne(mappedBy = "orderModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private PaymentModel PaymentModel;

	public OrderModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OrderModel(Integer orderId, Integer orderDate, UserModel user, List<OrderItemModel> orderItemModel,
			com.Google.amazon.model.PaymentModel paymentModel) {
		super();
		this.orderId = orderId;
		this.orderDate = orderDate;
		this.user = user;
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

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
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
		return "OrderModel [orderId=" + orderId + ", orderDate=" + orderDate + ", user=" + user + ", orderItemModel="
				+ orderItemModel + ", PaymentModel=" + PaymentModel + "]";
	}

}
