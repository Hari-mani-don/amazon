package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.CategoryModel;

@Repository
public interface CategoryRepository extends JpaRepository<CategoryModel, Integer> {

}
