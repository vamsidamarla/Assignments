package com.thoughtFocus.bank;

import com.thoughtFocus.bank.dao.AccountHolderDAO;
import com.thoughtFocus.bank.dto.AccountHolderDTO;
import com.thoughtFocus.bank.dto.AddressDTO;
import com.thoughtFocus.bank.exceptions.WithdrawException;
import com.thoughtFocus.bank.exceptions.depositException;
import com.thoughtFocus.bank.exceptions.getByNameException;
import com.thoughtFocus.bank.exceptions.getCurrentBalanceException;
import com.thoughtFocus.bank.exceptions.updatepincodeByAreaException;

public class Test {
	public static void main(String[] args) {
		AccountHolderDAO dao = new AccountHolderDAO();

		AccountHolderDTO dto = new AccountHolderDTO();
		AddressDTO address = new AddressDTO();

		dto.setAccounNumber(1234556747l);
		dto.setName("vamsi");
		dto.setiFSC("TF12345");
		dto.setContact(8767675765l);
		dto.setBalance(1000);

		address.setBuilding("5-165");
		address.setArea("sathupally");
		address.setLandmark("swimming pool");
		address.setCity("khammam");
		address.setState("telangana");
		address.setCountry("india");
		address.setPincode(507303);

		dto.setAddress(address);

		String saveStatus = dao.save(dto);
		System.out.println(saveStatus);
		System.out.println("================================================");

		AccountHolderDTO dto1 = new AccountHolderDTO();
		AddressDTO address1 = new AddressDTO();

		dto1.setAccounNumber(123235546l);
		dto1.setName("anand");
		dto1.setiFSC("TF12345");
		dto1.setContact(8767675765l);
		dto1.setBalance(5000);

		address1.setBuilding("8-165");
		address1.setArea("marlapadu");
		address1.setLandmark("water plant");
		address1.setCity("khammam");
		address1.setState("telangana");
		address1.setCountry("india");
		address1.setPincode(507305);

		dto1.setAddress(address1);

		String saveStatus1 = dao.save(dto1);
		System.out.println(saveStatus1);
		System.out.println("================================================");

		try {
			AccountHolderDTO getByName = dao.getByName("vamsi"); // get by name
			System.out.println(getByName);
		} catch (getByNameException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("================================================");

		String deleteStatus = dao.deleteByAccountNumber(123456890); // delete
		System.out.println(deleteStatus);
		System.out.println("================================================");

		String updateStatus = dao.updateContact(8767675765l, 7680838372l); // update contact
		System.out.println(updateStatus);

		System.out.println("*******************************************************");
		try {
			AccountHolderDTO updatePincodeStatus = dao.updatepincodeByArea("sathupally", 500100);// update pincode
			System.out.println(updatePincodeStatus);
		} catch (updatepincodeByAreaException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("*******************************************************");

		try {
			float balance = dao.getCurrentBalance(123235546); // current balance
			System.out.println(balance);
		} catch (getCurrentBalanceException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("*****************************************************");
		try {
			float depositStatus = dao.deposit(500, 1234556747); // deposit
			System.out.println(depositStatus);
		} catch (depositException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("*****************************************************");
		try {
			float debitedAmount = dao.withdraw(700, 1234556747);// withdraw
			System.out.println(debitedAmount);
		} catch (WithdrawException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("*****************************************************");

		dao.printAll();
	}
}
