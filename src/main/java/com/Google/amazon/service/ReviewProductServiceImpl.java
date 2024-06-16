package com.Google.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.ReviewProductDto;
import com.Google.amazon.model.ReviewProductModel;
import com.Google.amazon.repository.ReviewRepository;

@Service
public class ReviewProductServiceImpl
		implements ReviewProductService, DataTransferEntityToDtoService<ReviewProductModel, ReviewProductDto> {

	@Autowired
	ReviewRepository reviewRepository;

	@Override
	public ReviewProductDto addProductReview(ReviewProductDto reviewProductDto) {

		ReviewProductModel reviewProductModel = new ReviewProductModel();

		reviewProductModel.setComment(reviewProductDto.getComment());
		reviewProductModel.setRating(reviewProductDto.getRating());
		reviewProductModel.setReviewId(reviewProductDto.getReviewId());

		ReviewProductModel savedReviewProductModel = reviewRepository.save(reviewProductModel);

		return convertEntityToDto(savedReviewProductModel);
	}

	@Override
	public ReviewProductDto convertEntityToDto(ReviewProductModel reviewProductentity) {

		return new ReviewProductDto(reviewProductentity.getReviewId(), reviewProductentity.getRating(),
				reviewProductentity.getUser().getUserId(), reviewProductentity.getProductModel().getProductId(),
				reviewProductentity.getComment());
	}

}
