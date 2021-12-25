package com.thoughtFocus.mobile;

public class Test {
	public static void main(String[] args) {
		MobileDao dao = new MobileDao();

		MobileDTO dto = new MobileDTO();
		MobileDTO dto1 = new MobileDTO();

		dto.setMobileId(123456789l);
		dto.setBrandName("Iphone");
		dto.setMemory(32);
		dto.setModelName("iphone 6");
		dto.setNoOfCamera((byte) 2);
		dto.setPrice(25000);
		dto.setSerialNumber(987654321l);

		dto1.setMobileId(123458789l);
		dto1.setBrandName("samsung");
		dto1.setMemory(32);
		dto1.setModelName("galaxy");
		dto1.setNoOfCamera((byte) 4);
		dto1.setPrice(20000);
		dto1.setSerialNumber(987698321l);

		dao.add(dto); // adding mobile object
		dao.add(dto1);

		dao.getAll(); // printing all mobile objects

		System.out.println("================================================");

		dao.getAllByBrandName("Iphone"); // printing by brand name

		System.out.println("================================================");

		try {
			MobileDTO deleteStatus = dao.deleteByMobileID(128789l); // deleting object
			System.out.println(deleteStatus);
		} catch (DeleteByMobileIdException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("==================================================");

		try {
			MobileDTO updatStatus = dao.updateBySerialNumber(987654321l, 68265256335l); // updating object
			System.out.println(updatStatus);
		} catch (UpdateBySerialNumberExcxeption e) {
			System.out.println(e.getMessage());
		}
	}
}
