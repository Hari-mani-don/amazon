package com.Google.amazon.exception;

//required field null came 400
public class BadRequestException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public BadRequestException(String message) {
		super(message);
	}

}
