package com.Google.amazon.exception;

//https://example.com/nonexistent-page this resource not available the through 404
public class NotFoundException extends RuntimeException{

	private static final long serialVersionUID = 1L;

	public NotFoundException(String message) {
		super(message);
	}
	

}
