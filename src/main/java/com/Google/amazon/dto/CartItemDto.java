package com.Google.amazon.dto;

public class CartItemDto {
	private Integer cartItemId;
	private Integer quantity;
	private Integer userId;
	private Integer productId;

	public CartItemDto() {
		super();
	}

	public CartItemDto(Integer cartItemId, Integer quantity, Integer userId, Integer productId) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.userId = userId;
		this.productId = productId;
	}

	public Integer getCartItemId() {
		return cartItemId;
	}

	public void setCartItemId(Integer cartItemId) {
		this.cartItemId = cartItemId;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	@Override
	public String toString() {
		return "CartItemDto [cartItemId=" + cartItemId + ", quantity=" + quantity + ", userId=" + userId
				+ ", productId=" + productId + "]";
	}

}
