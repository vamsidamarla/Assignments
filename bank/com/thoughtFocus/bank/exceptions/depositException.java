package com.thoughtFocus.bank.exceptions;

public class depositException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Enter valid account number to deposit";
	}

}
