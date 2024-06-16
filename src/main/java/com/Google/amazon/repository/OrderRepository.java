package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.OrderModel;

@Repository
public interface OrderRepository extends JpaRepository<OrderModel, Integer> {

}
