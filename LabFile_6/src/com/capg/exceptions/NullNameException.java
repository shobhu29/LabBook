package com.capg.exceptions;

public class NullNameException extends Exception {


		private static final long serialVersionUID = 1L;

		@Override
		public String toString() {
			return "NullNameException";
		}
		
		@Override
		public String getMessage() {
			return " First name and Last name should not be null.";
		}
		

	}
