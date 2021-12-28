package com.thoughtFocus.linkedHashSet.exceptions;

public class AddException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Enter the correct details to add";
	}

}
