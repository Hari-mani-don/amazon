package com.Google.amazon.exception;

//input miss match json and java entity 
public class InvalidInputException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public InvalidInputException(String message) {
		super(message);
	}
}
