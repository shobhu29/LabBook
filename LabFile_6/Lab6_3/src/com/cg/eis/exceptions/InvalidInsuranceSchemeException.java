package com.cg.eis.exceptions;

public class InvalidInsuranceSchemeException extends Exception {

	private static final long serVerUID = 1L;

	@Override
	public String toString() {
		return "InvalidInsuranceSchemeException";
	}

	@Override
	public String getMessage() {
		return "You have insufficient salary for insurance scheme.";
	}

}
