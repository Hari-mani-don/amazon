package com.Google.amazon.exception;

/**
 * when start game the again try to start throw , buy click then again click 409
 * Conflict. Endpoint: /submit-order checks the status of the user's account
 * before processing the order.
 * 
 * Validation: If the account is not active, the server responds with a 409
 * Conflict status code, indicating that the current state of the account does
 * not allow the operation.
 */
public class IllegalStateException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public IllegalStateException(String message) {
		super(message);
	}

}
