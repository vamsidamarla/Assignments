package com.thoughtFocus.linkedHashSet.exceptions;

public class DeleteByMobileIdException extends RuntimeException {

	@Override
	public String getMessage() {
		return "enter the correct mobile id";
	}

}
