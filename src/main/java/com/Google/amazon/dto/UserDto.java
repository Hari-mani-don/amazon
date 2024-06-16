package com.Google.amazon.dto;

import java.util.List;

import com.Google.amazon.model.CartItemModel;
import com.Google.amazon.model.OrderModel;
import com.Google.amazon.model.ProfileModel;
import com.Google.amazon.model.ReviewProductModel;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

public class UserDto {

	private Integer userId;

	private String username;

	private String userEmail;

	private String userPassword;

	private ProfileModel profileModel;

	private List<OrderModel> orders;

	private List<ReviewProductModel> reviews;

	private List<CartItemModel> cartItems;

	public UserDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserDto(Integer userId, String username, String userEmail, String userPassword, ProfileModel profileModel,
			List<OrderModel> orders, List<ReviewProductModel> reviews, List<CartItemModel> cartItems) {
		super();
		this.userId = userId;
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
		return "UserDto [userId=" + userId + ", username=" + username + ", userEmail=" + userEmail + ", userPassword="
				+ userPassword + ", profileModel=" + profileModel + ", orders=" + orders + ", reviews=" + reviews
				+ ", cartItems=" + cartItems + "]";
	}

}
