package com.CustomException;


public class RequiredFileNotFoundException extends RuntimeException {

	public RequiredFileNotFoundException(String message) {
		super(message);
	}
	
}
