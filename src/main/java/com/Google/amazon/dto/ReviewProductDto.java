package com.Google.amazon.dto;

public class ReviewProductDto {
	private Integer reviewId;
	private Integer rating;
	private Integer userId;
	private Integer productId;
	private String comment;

	public ReviewProductDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ReviewProductDto(Integer reviewId, Integer rating, Integer userId, Integer productId, String comment) {
		super();
		this.reviewId = reviewId;
		this.rating = rating;
		this.userId = userId;
		this.productId = productId;
		this.comment = comment;
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

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	@Override
	public String toString() {
		return "ReviewProductDto [reviewId=" + reviewId + ", rating=" + rating + ", userId=" + userId + ", productId="
				+ productId + ", comment=" + comment + "]";
	}

}
