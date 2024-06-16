package com.Google.amazon.exception;

//admin page la login user possible but also check user is admin or not  403 
public class ForbiddenException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ForbiddenException(String message) {
		super(message);
	}

}
