package com.thoughtFocus.linkedHashSet;

public abstract class Mobile {
	abstract public boolean add(MobileDTO dto);

	abstract public void getAll();

	abstract public void getAllByBrandName(String brandName);

	abstract public MobileDTO deleteByMobileID(long mobileId);

	abstract public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber);
}
