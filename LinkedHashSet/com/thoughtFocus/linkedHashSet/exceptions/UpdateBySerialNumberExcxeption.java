package com.thoughtFocus.linkedHashSet.exceptions;

public class UpdateBySerialNumberExcxeption extends RuntimeException {

	@Override
	public String getMessage() {
		return "Re enter the serial number";
	}

}
