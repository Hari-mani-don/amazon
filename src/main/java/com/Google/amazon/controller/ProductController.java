package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.ProductDto;
import com.Google.amazon.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService productService;

	@PostMapping("/products")
	public ResponseEntity<List<ProductDto>> handleRetriveInitialProducts() {

		List<ProductDto> retriveInitialProduct = productService.retriveInitialProducts();
		return new ResponseEntity<List<ProductDto>>(retriveInitialProduct, HttpStatus.OK);
	}

	@GetMapping("/products/{productName}")
	public ResponseEntity<List<ProductDto>> handleRetriveByProductName(@PathVariable String productName) {

		List<ProductDto> retriveProductByName = productService.retriveByProductName(productName);
		return new ResponseEntity<List<ProductDto>>(retriveProductByName, HttpStatus.OK);
	}

	@GetMapping("/products/{productId}")
	public ResponseEntity<List<ProductDto>> handleRetriveByProductId(@PathVariable Integer productId) {

		List<ProductDto> retriveProductById = productService.retriveByProductId(productId);
		return new ResponseEntity<List<ProductDto>>(retriveProductById, HttpStatus.OK);
	}
}
