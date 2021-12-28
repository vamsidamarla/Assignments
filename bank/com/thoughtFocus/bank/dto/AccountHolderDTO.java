package com.thoughtFocus.bank.dto;

public class AccountHolderDTO {
	private long accounNumber;
	private String name;
	private String iFSC;
	private long contact;
	private float balance;
	private AddressDTO address;

	public float getBalance() {
		return balance;
	}

	public void setBalance(float balance) {
		this.balance = balance;
	}

	public long getAccounNumber() {
		return accounNumber;
	}

	public AddressDTO getAddress() {
		return address;
	}

	public void setAddress(AddressDTO address) {
		this.address = address;
	}

	public void setAccounNumber(long accounNumber) {
		this.accounNumber = accounNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getiFSC() {
		return iFSC;
	}

	public void setiFSC(String iFSC) {
		this.iFSC = iFSC;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	@Override
	public String toString() {
		return "AccountHolderDTO [accounNumber=" + accounNumber + ", name=" + name + ", iFSC=" + iFSC + ", contact="
				+ contact + ", balance=" + balance + ", address=" + address + "]";
	}

}
