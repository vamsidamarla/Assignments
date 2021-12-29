package com.thoughtfocus.map;

public class UpdatePriceByKeyException extends RuntimeException {

	@Override
	public String getMessage() {
		return "enter valid key to update the price";
	}

}
