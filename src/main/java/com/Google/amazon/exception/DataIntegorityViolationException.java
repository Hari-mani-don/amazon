package com.Google.amazon.exception;

//Unique constraints add that time 
public class DataIntegorityViolationException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public DataIntegorityViolationException(String message) {
		super(message);
	}

}
