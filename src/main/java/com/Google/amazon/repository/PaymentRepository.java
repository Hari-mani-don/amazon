package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.PaymentModel;

@Repository
public interface PaymentRepository extends JpaRepository<PaymentModel, Integer> {

}
