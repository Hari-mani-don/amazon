package com.Google.amazon.dto;

public class ProductCategoryDto {
	private Integer productCategoryId;
	private Integer productId;
	private Integer categoryId;

	public ProductCategoryDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProductCategoryDto(Integer productCategoryId, Integer productId, Integer categoryId) {
		super();
		this.productCategoryId = productCategoryId;
		this.productId = productId;
		this.categoryId = categoryId;
	}

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	@Override
	public String toString() {
		return "ProductCategoryDto [productCategoryId=" + productCategoryId + ", productId=" + productId
				+ ", categoryId=" + categoryId + "]";
	}

}
