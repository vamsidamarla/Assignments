package com.thoughtFocus.mobile;

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

}
