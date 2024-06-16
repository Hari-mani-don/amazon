package com.Google.amazon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Google.amazon.dto.PaymentDto;
import com.Google.amazon.model.PaymentModel;
import com.Google.amazon.repository.PaymentRepository;

@Service
public class PaymentServiceImpl implements PaymentService, DataTransferEntityToDtoService<PaymentModel, PaymentDto> {

	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public PaymentDto processPayment(PaymentDto paymentDto) {

		PaymentModel paymentModel = new PaymentModel();
		paymentModel.setAmount(paymentDto.getAmount());
		paymentModel.setPaymentId(paymentDto.getPaymentId());
		paymentModel.setPaymentDate(paymentDto.getPaymentDate());
		paymentModel.setPaymentMethod(paymentDto.getPaymentMethod());

		PaymentModel savedPaymentModel = paymentRepository.save(paymentModel);

		return convertEntityToDto(savedPaymentModel);
	}

	@Override
	public PaymentDto convertEntityToDto(PaymentModel paymentEntity) {

		return new PaymentDto(paymentEntity.getPaymentId(), paymentEntity.getPaymentDate(),
				paymentEntity.getPaymentMethod(), paymentEntity.getAmount(),
				paymentEntity.getOrderModel().getOrderId());
	}

}
