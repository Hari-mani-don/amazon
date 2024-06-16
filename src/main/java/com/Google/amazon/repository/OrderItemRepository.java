package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.OrderItemModel;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItemModel, Integer> {

}
