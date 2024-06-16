package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.ProductCategoryDto;
import com.Google.amazon.service.ProductCategoryService;

@RestController
public class ProductCategoryController {
	@Autowired
	ProductCategoryService productCategoryService;

	@PostMapping("/categorys/product_categorys")
	public ResponseEntity<List<ProductCategoryDto>> handleFetchProductCategory() {
		List<ProductCategoryDto> fetchProductCategory = productCategoryService.fetchProductCategory();
		return new ResponseEntity<List<ProductCategoryDto>>(fetchProductCategory, HttpStatus.OK);
	}
}
