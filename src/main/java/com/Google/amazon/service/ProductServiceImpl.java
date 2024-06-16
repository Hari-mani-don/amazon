package com.Google.amazon.service;

import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.ProductDto;
import com.Google.amazon.model.ProductModel;
import com.Google.amazon.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService, DataTransferEntityToDtoService<ProductModel, ProductDto> {

	@Autowired
	ProductRepository productRepository;

	@Override
	public List<ProductDto> retriveInitialProducts() {

		List<ProductModel> productModel = productRepository.findAll();

		List<ProductDto> entityToDto = productModel.stream().map(this::convertEntityToDto).collect(Collectors.toList());
		return entityToDto;
	}

	@Override
	public List<ProductDto> retriveByProductName(String productName) {
		List<ProductModel> productModel = productRepository.searchProductByName(productName);
		List<ProductDto> productDto = productModel.stream().map(this::convertEntityToDto).collect(Collectors.toList());
		return productDto;
	}

	@Override
	public List<ProductDto> retriveByProductId(Integer productId) {
		List<ProductModel> productModel = productRepository.searchProductById(productId);
		List<ProductDto> productDto = productModel.stream().map(this::convertEntityToDto).collect(Collectors.toList());
		return productDto;
	}

	@Override
	public ProductDto convertEntityToDto(ProductModel product) {

		return new ProductDto(product.getProductId(), product.getName(), product.getDescription(), product.getPrice(),
				product.getStockQuantity(), product.getProductCategoryModel(), product.getOrderItemModel(),
				product.getReviewProductModel(), product.getCartItemModel());
	}

}
