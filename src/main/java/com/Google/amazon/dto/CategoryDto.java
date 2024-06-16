package com.Google.amazon.dto;

import java.util.List;

import com.Google.amazon.model.ProductCategoryModel;

public class CategoryDto {
	private Integer categoryId;
	private String name;
	private List<ProductCategoryModel> productCategory;

	public CategoryDto() {
		super();
	}

	public CategoryDto(Integer categoryId, String name, List<ProductCategoryModel> productCategory) {
		super();
		this.categoryId = categoryId;
		this.name = name;
		this.productCategory = productCategory;
	}

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<ProductCategoryModel> getProductCategory() {
		return productCategory;
	}

	public void setProductCategory(List<ProductCategoryModel> productCategory) {
		this.productCategory = productCategory;
	}

	@Override
	public String toString() {
		return "CategoryDto [categoryId=" + categoryId + ", name=" + name + ", productCategory=" + productCategory
				+ "]";
	}

}
