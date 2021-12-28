package com.thoughtFocus.bank.exceptions;

public class getCurrentBalanceException extends RuntimeException {

	@Override
	public String getMessage() {

		return "Enter valid account number";
	}

}
