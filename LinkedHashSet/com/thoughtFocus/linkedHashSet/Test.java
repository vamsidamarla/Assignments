package com.thoughtFocus.linkedHashSet;

import com.thoughtFocus.linkedHashSet.exceptions.AddException;
import com.thoughtFocus.linkedHashSet.exceptions.DeleteByMobileIdException;
import com.thoughtFocus.linkedHashSet.exceptions.UpdateBySerialNumberExcxeption;

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

		dao.getAll();
		System.out.println("-----------------------------------------");
		try {
			dao.add(Iphone); // adding mobile1
			dao.add(samsung); // adding mobile2
		} catch (AddException e) {
			System.out.println(e.getMessage());
		}

		dao.getAll(); // printing all mobiles
		System.out.println("-----------------------------------------");

		dao.getAllByBrandName("Iphone"); // getting mobiles by brand name

		System.out.println("-----------------------------------------");

		try {
			MobileDTO status = dao.deleteByMobileID(123458789); // deleting by moileid
			System.err.println(status + "<-------------- deleted");
		} catch (DeleteByMobileIdException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("-----------------------------------------");

		try {
			MobileDTO status = dao.updateBySerialNumber(987654321, 987654999l); // updating serial number
			System.out.println(status);
		} catch (UpdateBySerialNumberExcxeption e) {
			System.out.println(e.getMessage());
		}
		System.out.println("-----------------------------------------");

		dao.getAll();
	}
}
