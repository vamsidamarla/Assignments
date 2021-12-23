package com.thoughtFocus.traineeDetails;

public class TraineeDetails {
	private int id;
	private String name;
	private long phoneNumber;

	public TraineeDetails() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public long getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	@Override
	public String toString() {
		return "TraineeDetails [id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + "]";
	}

}
