package com.Google.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.ReviewProductDto;
import com.Google.amazon.service.ReviewProductService;

@RestController
public class ReviewController {
	@Autowired
	ReviewProductService reviewProductService;

	@PostMapping("/users/products/reviews")
	public ResponseEntity<ReviewProductDto> handleAddProductReview(@RequestBody ReviewProductDto reviewProductDto) {
		ReviewProductDto addProductReview = reviewProductService.addProductReview(reviewProductDto);

		return new ResponseEntity<ReviewProductDto>(addProductReview, HttpStatus.OK);
	}

}
