package com.Google.amazon.service;

import java.util.List;

import com.Google.amazon.dto.ProductDto;

public interface ProductService {

	List<ProductDto> retriveInitialProducts();

	List<ProductDto> retriveByProductName(String productName);

	List<ProductDto> retriveByProductId(Integer productId);

}
