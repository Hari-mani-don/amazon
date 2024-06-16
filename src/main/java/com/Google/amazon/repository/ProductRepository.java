package com.Google.amazon.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.ProductModel;

@Repository
public interface ProductRepository extends JpaRepository<ProductModel, Integer> {

	List<ProductModel> searchProductByName(String productName);

	@Query("SELECT p FROM ProductModel p WHERE p.productId = :productId")
	List<ProductModel> searchProductById(@Param("productId") Integer productId);

}
