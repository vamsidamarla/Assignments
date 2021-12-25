package com.thoughtFocus.mobile;

public class DeleteByMobileIdException extends RuntimeException {

	@Override
	public String getMessage() {
		return "Unable to delete...... provide valid details";
	}
}
