package com.thoughtFocus.mobile;

public class UpdateBySerialNumberExcxeption extends RuntimeException {

	@Override
	public String getMessage() {

		return "Enter valid serial number of mobile to update";
	}

}
