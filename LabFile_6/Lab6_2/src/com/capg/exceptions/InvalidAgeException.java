package com.capg.exceptions;

public class InvalidAgeException extends Exception {


	private static final long serVerUID = 1L;
	
	@Override
	public String toString() {
		return "InvalidAgeException";
	}

	@Override
	public String getMessage() {
		return "Age should be greater than 15.";
	}

}
