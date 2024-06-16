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
import jakarta.persistence.OneToMany;

@Entity
public class ProductModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id")
	private Integer productId;
	private String name;
	private String description;
	private Double price;
	private Double stockQuantity;

	@ManyToMany(mappedBy = "productModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ProductCategoryModel> productCategoryModel;

	@OneToMany(mappedBy = "productModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<OrderItemModel> orderItemModel;

	@OneToMany(mappedBy = "productModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<ReviewProductModel> reviewProductModel;

	@OneToMany(mappedBy = "productModel", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	private List<CartItemModel> cartItemModel;

	public ProductModel() {
		super();
	}

	public ProductModel(Integer productId, String name, String description, Double price, Double stockQuantity,
			List<ProductCategoryModel> productCategoryModel, List<OrderItemModel> orderItemModel,
			List<ReviewProductModel> reviewProductModel, List<CartItemModel> cartItemModel) {
		super();
		this.productId = productId;
		this.name = name;
		this.description = description;
		this.price = price;
		this.stockQuantity = stockQuantity;
		this.productCategoryModel = productCategoryModel;
		this.orderItemModel = orderItemModel;
		this.reviewProductModel = reviewProductModel;
		this.cartItemModel = cartItemModel;
	}

	public Integer getProductId() {
		return productId;
	}

	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getStockQuantity() {
		return stockQuantity;
	}

	public void setStockQuantity(Double stockQuantity) {
		this.stockQuantity = stockQuantity;
	}

	public List<ProductCategoryModel> getProductCategoryModel() {
		return productCategoryModel;
	}

	public void setProductCategoryModel(List<ProductCategoryModel> productCategoryModel) {
		this.productCategoryModel = productCategoryModel;

	}

	public List<OrderItemModel> getOrderItemModel() {
		return orderItemModel;
	}

	public void setOrderItemModel(List<OrderItemModel> orderItemModel) {
		this.orderItemModel = orderItemModel;

	}

	public List<ReviewProductModel> getReviewProductModel() {
		return reviewProductModel;
	}

	public void setReviewProductModel(List<ReviewProductModel> reviewProductModel) {
		this.reviewProductModel = reviewProductModel;

	}

	public List<CartItemModel> getCartItemModel() {
		return cartItemModel;
	}

	public void setCartItemModel(List<CartItemModel> cartItemModel) {
		this.cartItemModel = cartItemModel;

	}

	@Override
	public String toString() {
		return "ProductModel [productId=" + productId + ", name=" + name + ", description=" + description + ", price="
				+ price + ", stockQuantity=" + stockQuantity + ", productCategoryModel=" + productCategoryModel
				+ ", orderItemModel=" + orderItemModel + ", reviewProductModel=" + reviewProductModel
				+ ", cartItemModel=" + cartItemModel + "]";
	}

}
