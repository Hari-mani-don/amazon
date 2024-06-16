package com.Google.amazon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.ProductCategoryDto;
import com.Google.amazon.model.ProductCategoryModel;
import com.Google.amazon.repository.ProductCategoryRepository;

@Service
public class ProductCategoryServiceImpl
		implements ProductCategoryService, DataTransferEntityToDtoService<ProductCategoryModel, ProductCategoryDto> {

	@Autowired
	ProductCategoryRepository productCategoryRepository;

	@Override
	public List<ProductCategoryDto> fetchProductCategory() {

		List<ProductCategoryModel> productCategoryModel = productCategoryRepository.findAll();
		List<ProductCategoryDto> productCategoryDto = productCategoryModel.stream().map(this::convertEntityToDto)
				.collect(Collectors.toList());
		return productCategoryDto;
	}

	@Override
	public ProductCategoryDto convertEntityToDto(ProductCategoryModel productEntity) {

		return new ProductCategoryDto(productEntity.getProductCategoryId(),
				productEntity.getProductModel().get(0).getProductId(),
				productEntity.getCategoryModel().get(0).getCategoryId());
	}

}
