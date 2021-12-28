package com.thoughtFocus.linkedHashSet;

import java.util.Objects;

public class MobileDTO {
	private long mobileId;
	private String modelName;
	private int price;
	private int memory;
	private String brandName;
	private long serialNumber;
	private byte noOfCamera;

	public void MobileProperties() {

	}

	public long getMobileId() {
		return mobileId;
	}

	public void setMobileId(long mobileId) {
		this.mobileId = mobileId;
	}

	public String getModelName() {
		return modelName;
	}

	public void setModelName(String modelName) {
		this.modelName = modelName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMemory() {
		return memory;
	}

	public void setMemory(int memory) {
		this.memory = memory;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	public long getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(long serialNumber) {
		this.serialNumber = serialNumber;
	}

	public byte getNoOfCamera() {
		return noOfCamera;
	}

	public void setNoOfCamera(byte noOfCamera) {
		this.noOfCamera = noOfCamera;
	}

	@Override
	public String toString() {
		return "MobileProperties [mobileId=" + mobileId + ", modelName=" + modelName + ", price=" + price + ", memory="
				+ memory + ", brandName=" + brandName + ", serialNumber=" + serialNumber + ", noOfCamera=" + noOfCamera
				+ "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(brandName, memory, mobileId, modelName, noOfCamera, price, serialNumber);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MobileDTO other = (MobileDTO) obj;
		return Objects.equals(brandName, other.brandName) && memory == other.memory && mobileId == other.mobileId
				&& Objects.equals(modelName, other.modelName) && noOfCamera == other.noOfCamera && price == other.price
				&& serialNumber == other.serialNumber;
	}
}
