package com.Google.amazon.exception;

import java.io.IOException;

/**
 * null trying to access method 500 Internal Server Error
 */
public class NullPointerException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public NullPointerException(String message) {
		super(message);
	}

}
