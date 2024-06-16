package com.Google.amazon.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.CategoryDto;
import com.Google.amazon.service.CategoryService;

@RestController
public class CategoryController {

	@Autowired
	CategoryService categoryService;

	@PostMapping("/categorys")
	public ResponseEntity<List<CategoryDto>> handleFetchCategory() {
		List<CategoryDto> fetchCategory = categoryService.fetchCategory();
		return new ResponseEntity<List<CategoryDto>>(fetchCategory, HttpStatus.OK);
	}

}
