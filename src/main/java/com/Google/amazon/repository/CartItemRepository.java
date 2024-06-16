package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.CartItemModel;

@Repository
public interface CartItemRepository extends JpaRepository<CartItemModel, Integer> {

}
