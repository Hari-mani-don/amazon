package com.Google.amazon.exception;

//enter crendial wrong 401
public class UnauthorizedAccessException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public UnauthorizedAccessException(String message) {
		super(message);
	}

}
