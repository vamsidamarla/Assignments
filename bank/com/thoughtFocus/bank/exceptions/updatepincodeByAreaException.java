package com.thoughtFocus.bank.exceptions;

public class updatepincodeByAreaException extends RuntimeException {

	@Override
	public String getMessage() {

		return "Unable to update pincode..enter valid area";
	}

}
