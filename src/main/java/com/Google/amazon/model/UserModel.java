package com.Google.amazon.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class UserModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "user_id")
	private Integer userId;

	@Column(name = "user_name", nullable = false)
	private String username;

	@Column(name = "user_email", nullable = false)
	private String userEmail;

	@Column(name = "user_password", nullable = false)
	private String userPassword;

	@OneToOne(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private ProfileModel profileModel;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OrderModel> orders;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ReviewProductModel> reviews;

	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartItemModel> cartItems;

	public UserModel() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserModel(String username, String userEmail, String userPassword, ProfileModel profileModel,
			List<OrderModel> orders, List<ReviewProductModel> reviews, List<CartItemModel> cartItems) {
		super();
		this.username = username;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
		this.profileModel = profileModel;
		this.orders = orders;
		this.reviews = reviews;
		this.cartItems = cartItems;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public ProfileModel getProfileModel() {
		return profileModel;
	}

	public void setProfileModel(ProfileModel profileModel) {
		this.profileModel = profileModel;

	}

	public List<OrderModel> getOrders() {
		return orders;
	}

	public void setOrders(List<OrderModel> orders) {
		this.orders = orders;

	}

	public List<ReviewProductModel> getReviews() {
		return reviews;
	}

	public void setReviews(List<ReviewProductModel> reviews) {
		this.reviews = reviews;
	}

	public List<CartItemModel> getCartItems() {
		return cartItems;
	}

	public void setCartItems(List<CartItemModel> cartItems) {
		this.cartItems = cartItems;

	}

	@Override
	public String toString() {
		return "UserModel [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", profileModel=" + profileModel + ", orders=" + orders + ", reviews=" + reviews
				+ ", cartItems=" + cartItems + "]";
	}

}
