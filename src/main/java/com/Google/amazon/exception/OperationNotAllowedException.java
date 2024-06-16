package com.Google.amazon.exception;

//whenever subscription account doesn't try delete 
public class OperationNotAllowedException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public OperationNotAllowedException(String message) {
		super(message);
	}

}
