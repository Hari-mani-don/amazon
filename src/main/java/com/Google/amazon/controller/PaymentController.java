package com.Google.amazon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Google.amazon.dto.PaymentDto;
import com.Google.amazon.service.PaymentService;

@RestController
public class PaymentController {
	@Autowired
	PaymentService paymentService;

	@PostMapping("/users/payments")
	public ResponseEntity<PaymentDto> handelProcessPayment(@RequestBody PaymentDto paymentDto) {
		PaymentDto processPayment = paymentService.processPayment(paymentDto);
		return new ResponseEntity<PaymentDto>(processPayment, HttpStatus.OK);
	}
}
