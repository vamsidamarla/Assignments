package com.thoughtFocus.bank.exceptions;

public class getByNameException extends RuntimeException {

	@Override
	public String getMessage() {
		return "User with the given name not found";
	}

}
