package com.Google.amazon.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PaymentModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer paymentId;
	private Date paymentDate;
	private String paymentMethod;
	private Double amount;

//	private Integer order_id;
	@OneToOne
	@JoinColumn(name = "order_id", referencedColumnName = "order_id")
	@JsonIgnore
	private OrderModel orderModel;

	public PaymentModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentModel(Date paymentDate, String paymentMethod, Double amount, OrderModel orderModel) {
		super();
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.orderModel = orderModel;
	}

	public Integer getPaymentId() {
		return paymentId;
	}

	public void setPaymentId(Integer paymentId) {
		this.paymentId = paymentId;
	}

	public Date getPaymentDate() {
		return paymentDate;
	}

	public void setPaymentDate(Date paymentDate) {
		this.paymentDate = paymentDate;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public Double getAmount() {
		return amount;
	}

	public void setAmount(Double amount) {
		this.amount = amount;
	}

	public OrderModel getOrderModel() {
		return orderModel;
	}

	public void setOrderModel(OrderModel orderModel) {
		this.orderModel = orderModel;
	}

	@Override
	public String toString() {
		return "PaymentModel [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentMethod="
				+ paymentMethod + ", amount=" + amount + ", orderModel=" + orderModel + "]";
	}

}
