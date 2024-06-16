package com.Google.amazon.exception;

//Api currently unavailable
public class ServiceUnavilabeException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ServiceUnavilabeException(String message) {
		super(message);
	}

}
