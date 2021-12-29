package com.thoughtfocus.map;

public class Test {
	public static void main(String[] args) {
		MobileDAO dao = new MobileDAO();

		MobileDTO Iphone = new MobileDTO();
		MobileDTO samsung = new MobileDTO();

		Iphone.setMobileId(123456789l);
		Iphone.setBrandName("Iphone");
		Iphone.setMemory(32);
		Iphone.setModelName("iphone 6");
		Iphone.setNoOfCamera((byte) 2);
		Iphone.setPrice(25000);
		Iphone.setSerialNumber(987654321l);

		samsung.setMobileId(123458789l);
		samsung.setBrandName("samsung");
		samsung.setMemory(32);
		samsung.setModelName("galaxy");
		samsung.setNoOfCamera((byte) 4);
		samsung.setPrice(20000);
		samsung.setSerialNumber(987698321l);

		dao.getByKey("jgkjs");

		dao.save("samsung", samsung); // saving
		dao.save("iphone", Iphone); // saving
		System.out.println("===========================================");

		dao.getByKey("samsung");// getting by key
		dao.getByKey("iphone");// getting by key
		System.out.println("===========================================");

		try {
			System.err.println(dao.deleteByKey("iphone"));    // deleting mobile by key
		} catch (DeleteException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("===========================================");

		try {
			System.out.println(dao.updatePriceByKey("samsung"));  //updating mobile by key
		} catch (UpdatePriceByKeyException e) {
			System.out.println(e.getMessage());
		}

	}
}
