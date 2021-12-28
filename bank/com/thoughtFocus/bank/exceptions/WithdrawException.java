package com.thoughtFocus.bank.exceptions;

public class WithdrawException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Enter valid account number to withdraw";
	}

}
