package com.phoenix.web.exceptions;

public class UserNotFoundException extends Exception {
	private String errorMessage;
	
	public UserNotFoundException(String errorMessage) {
		// TODO Auto-generated constructor stub
		super(errorMessage);
		this.errorMessage=errorMessage;
	}

}
