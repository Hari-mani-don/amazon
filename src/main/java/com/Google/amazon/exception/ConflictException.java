package com.Google.amazon.exception;

//unique field add
public class ConflictException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ConflictException(String message) {
		super(message);
	}

}
