package com.Google.amazon.model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class CategoryModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "category_id")
	private Integer categoryId;
	private String name;

	
	@ManyToMany(mappedBy = "categoryModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProductCategoryModel> productCategory;

	public CategoryModel() {
		super();
	}

	public CategoryModel(Integer categoryId, String name, List<ProductCategoryModel> productCategory) {
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
		return "CategoryModel [categoryId=" + categoryId + ", name=" + name + ", productCategory=" + productCategory
				+ "]";
	}

}
