package com.Google.amazon.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.CategoryDto;
import com.Google.amazon.model.CategoryModel;
import com.Google.amazon.repository.CategoryRepository;

@Service
public class CategorySeviceImpl implements CategoryService, DataTransferEntityToDtoService<CategoryModel, CategoryDto> {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<CategoryDto> fetchCategory() {

		List<CategoryModel> categoryModel = categoryRepository.findAll();
		List<CategoryDto> categoryDto = categoryModel.stream().map(this::convertEntityToDto)
				.collect(Collectors.toList());

		return categoryDto;
	}

	@Override
	public CategoryDto convertEntityToDto(CategoryModel category) {

		return new CategoryDto(category.getCategoryId(), category.getName(), category.getProductCategory());
	}

}
