package com.Google.amazon.exception;

/**
 * server process next step then some issue came like bug, server configuration,
 * database issue, server stop You see a message like: "500 Internal Server
 * Error - Something went wrong on our end. Please try again later."
 * 
 */
public class InternalServerErrorException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public InternalServerErrorException(String message) {
		super(message);
	}

}
