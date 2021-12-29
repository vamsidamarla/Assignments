package com.thoughtfocus.map;

public class DeleteException extends RuntimeException {

	@Override
	public String getMessage() {
		return "please provide a valid key";
	}

}
