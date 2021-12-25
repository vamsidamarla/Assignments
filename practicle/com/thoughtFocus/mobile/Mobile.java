package com.thoughtFocus.mobile;

public abstract class Mobile {
	abstract public void add(MobileDTO dto);

	abstract public void getAll();

	abstract public void getAllByBrandName(String brandName);

	abstract public MobileDTO deleteByMobileID(long mobileId);

	abstract public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber);
}
