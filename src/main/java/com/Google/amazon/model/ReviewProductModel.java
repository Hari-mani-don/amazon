package com.Google.amazon.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class ReviewProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer reviewId;
	private Integer rating;
	private String comment;

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

	public ReviewProductModel() {
		super();
	}

	public ReviewProductModel(Integer reviewId, Integer rating, String comment, UserModel user,
			ProductModel productModel) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.comment = comment;
		this.user = user;
		this.productModel = productModel;
	}

	public Integer getReviewId() {
		return reviewId;
	}

	public void setReviewId(Integer reviewId) {
		this.reviewId = reviewId;
	}

	public Integer getRating() {
		return rating;
	}

	public void setRating(Integer rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
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
		return "ReviewProductModel [reviewId=" + reviewId + ", rating=" + rating + ", comment=" + comment + ", user="
				+ user + ", productModel=" + productModel + "]";
	}

}
