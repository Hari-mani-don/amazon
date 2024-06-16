package com.Google.amazon.exception;

/**
 * Argument must positive but came negative then throw this not have any
 * httpStatus but web context use this 400 Bad Request
 */
public class IllegalArgumentException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalArgumentException(String message) {
		super(message);
	}

}
