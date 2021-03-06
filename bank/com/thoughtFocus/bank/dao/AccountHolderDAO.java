package com.thoughtFocus.bank.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.thoughtFocus.bank.dto.AccountHolderDTO;
import com.thoughtFocus.bank.exceptions.WithdrawException;
import com.thoughtFocus.bank.exceptions.depositException;
import com.thoughtFocus.bank.exceptions.getByNameException;
import com.thoughtFocus.bank.exceptions.getCurrentBalanceException;
import com.thoughtFocus.bank.exceptions.updatepincodeByAreaException;

public class AccountHolderDAO {
	private List<AccountHolderDTO> dtos = new ArrayList<AccountHolderDTO>();

	public String save(AccountHolderDTO dto) {
		boolean saveStatus = dtos.add(dto);
		if (saveStatus) {
			return "Account details saved";
		} else {
			return "Account details not saved";
		}
	}

	public AccountHolderDTO getByName(String name) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getName().equals(name)) {
				return dtos.get(index);
			}
		}
		getByNameException nameException =new getByNameException();
		throw nameException;
	}

	public String deleteByAccountNumber(long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccounNumber() == accountNumber) {
				dtos.remove(index);
				return "account deleted";
			}
		}
		return "account number doesn't match";
	}

	public String updateContact(long oldContact, long newContact) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getContact() == oldContact) {
				dtos.get(index).setContact(newContact);
				return "contact is updated";
			}
		}
		return "contact is not updated";
	}

	public void printAll() {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccounNumber() != 0) {
				System.out.println(dtos.get(index));
			}
		}
	}

	public AccountHolderDTO updatepincodeByArea(String area, int pincode) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAddress().getArea().equals(area)) {
				dtos.get(index).getAddress().setPincode(pincode);
				return dtos.get(index);
			}
		}
		updatepincodeByAreaException pincodeException =new updatepincodeByAreaException();
		throw pincodeException;
	}

	public float getCurrentBalance(long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccounNumber() == accountNumber) {
				return dtos.get(index).getBalance();

			}
		}
		getCurrentBalanceException balanceException =new getCurrentBalanceException();
		throw balanceException;
	}

	public float deposit(float amount, long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccounNumber() == accountNumber) {
				float previousBalance = dtos.get(index).getBalance();
				float newBalance = previousBalance + amount;
				dtos.get(index).setBalance(newBalance);
				return newBalance;
			}
		}
		depositException depositException =new depositException();
		throw depositException;
	}

	public float withdraw(float amount, long accountNumber) {
		for (int index = 0; index < dtos.size(); index++) {
			if (dtos.get(index).getAccounNumber() == accountNumber) {
				if (dtos.get(index).getBalance() > amount) {
					float currentBalance = dtos.get(index).getBalance() - amount;
					dtos.get(index).setBalance(currentBalance);
					return currentBalance;
				}
			}
		}
		WithdrawException withdrawException =new WithdrawException();
		throw withdrawException;
	}

}
