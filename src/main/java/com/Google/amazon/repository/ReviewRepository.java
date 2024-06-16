package com.Google.amazon.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Google.amazon.model.ReviewProductModel;

@Repository
public interface ReviewRepository extends JpaRepository<ReviewProductModel, Integer> {

}
