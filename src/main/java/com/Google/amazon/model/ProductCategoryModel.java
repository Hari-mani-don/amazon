package com.Google.amazon.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "product_category")
public class ProductCategoryModel {

//	private Integer product_id;
//	private Integer category_id; 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productCategoryId;

	@ManyToMany
	@JoinTable(name = "product_id", joinColumns = @JoinColumn(name = "product_category_id"), inverseJoinColumns = @JoinColumn(name = "product_id"))
	@JsonIgnore
	private List<ProductModel> productModel;

	@ManyToMany
	@JoinTable(name = "category_id", joinColumns = @JoinColumn(name = "product_category_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))
	@JsonIgnore
	private List<CategoryModel> categoryModel;

	public ProductCategoryModel() {
		super();
	}

	public ProductCategoryModel(Integer productCategoryId, List<ProductModel> productModel,
			List<CategoryModel> categoryModel) {
		super();
		this.productCategoryId = productCategoryId;
		this.productModel = productModel;
		this.categoryModel = categoryModel;
	}

	public Integer getProductCategoryId() {
		return productCategoryId;
	}

	public void setProductCategoryId(Integer productCategoryId) {
		this.productCategoryId = productCategoryId;
	}

	public List<ProductModel> getProductModel() {
		return productModel;
	}

	public void setProductModel(List<ProductModel> productModel) {
		this.productModel = productModel;
	}

	public List<CategoryModel> getCategoryModel() {
		return categoryModel;
	}

	public void setCategoryModel(List<CategoryModel> categoryModel) {
		this.categoryModel = categoryModel;
	}

	@Override
	public String toString() {
		return "ProductCategoryModel [productCategoryId=" + productCategoryId + ", productModel=" + productModel
				+ ", categoryModel=" + categoryModel + "]";
	}

}
