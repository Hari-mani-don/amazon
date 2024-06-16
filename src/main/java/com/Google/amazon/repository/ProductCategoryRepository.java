package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.ProductCategoryModel;

@Repository
public interface ProductCategoryRepository extends JpaRepository<ProductCategoryModel, Integer> {

}
