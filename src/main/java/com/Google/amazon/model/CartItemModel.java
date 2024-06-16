package com.Google.amazon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class CartItemModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cartItemId;
	private Integer quantity;

//	user_id (Foreign Key to User)
//	product_id (Foreign Key to Product)

	@ManyToOne
	@JoinColumn(name = "user_id", referencedColumnName = "user_id")
	@JsonIgnore
	private UserModel user;

	@ManyToOne
	@JoinColumn(name = "product_id", referencedColumnName = "product_id")
	@JsonIgnore
	private ProductModel productModel;

	public CartItemModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CartItemModel(Integer cartItemId, Integer quantity, UserModel user, ProductModel productModel) {
		super();
		this.cartItemId = cartItemId;
		this.quantity = quantity;
		this.user = user;
		this.productModel = productModel;
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

	public UserModel getUser() {
		return user;
	}

	public void setUser(UserModel user) {
		this.user = user;
	}

	public ProductModel getProductModel() {
		return productModel;
	}

	public void setProductModel(ProductModel productModel) {
		this.productModel = productModel;
	}

	@Override
	public String toString() {
		return "CartItemModel [cartItemId=" + cartItemId + ", quantity=" + quantity + ", user=" + user
				+ ", productModel=" + productModel + "]";
	}

}
