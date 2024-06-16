package com.Google.amazon.dto;

import java.util.Date;

public class PaymentDto {
	private Integer paymentId;
	private Date paymentDate;
	private String paymentMethod;
	private Double amount;
	private Integer orderId;

	public PaymentDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public PaymentDto(Integer paymentId, Date paymentDate, String paymentMethod, Double amount, Integer orderId) {
		super();
		this.paymentId = paymentId;
		this.paymentDate = paymentDate;
		this.paymentMethod = paymentMethod;
		this.amount = amount;
		this.orderId = orderId;
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

	public Integer getOrderId() {
		return orderId;
	}

	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	@Override
	public String toString() {
		return "PaymentDto [paymentId=" + paymentId + ", paymentDate=" + paymentDate + ", paymentMethod="
				+ paymentMethod + ", amount=" + amount + ", orderId=" + orderId + "]";
	}

}
