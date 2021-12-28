package com.thoughtFocus.linkedHashSet;

import java.util.Iterator;
import java.util.LinkedHashSet;

import com.thoughtFocus.linkedHashSet.exceptions.AddException;
import com.thoughtFocus.linkedHashSet.exceptions.DeleteByMobileIdException;
import com.thoughtFocus.linkedHashSet.exceptions.UpdateBySerialNumberExcxeption;

public class MobileDAO extends Mobile {
	LinkedHashSet<MobileDTO> mobileDto = new LinkedHashSet<>();

	@Override
	public boolean add(MobileDTO dto) {
		if (dto.getMobileId() != 0 && dto.getSerialNumber() != 0) {
			mobileDto.add(dto);
			return true;
		}
		AddException addException = new AddException();
		throw addException;
	}

	@Override
	public void getAll() {
		if (!mobileDto.isEmpty()) {
			mobileDto.forEach(eachMobile -> System.out.println(eachMobile));
		} else {
			System.out.println("No mobiles to show....");
		}

	}

	@Override
	public void getAllByBrandName(String brandName) {
		if (!mobileDto.isEmpty()) {
			Iterator<MobileDTO> iterator = mobileDto.iterator();
			while (iterator.hasNext()) {
				MobileDTO mobile = iterator.next();
				if (mobile.getBrandName().equals(brandName)) {
					System.out.println(mobile);
				}
			}
		} else {
			System.out.println("No matches with the name... mobile list is empty");
		}

	}

	@Override
	public MobileDTO deleteByMobileID(long mobileId) {
		Iterator<MobileDTO> iterator = mobileDto.iterator();
		while (iterator.hasNext()) {
			MobileDTO mobile = iterator.next();
			if (mobile.getMobileId() == mobileId) {
				mobileDto.remove(mobile);
				return mobile;
			}
		}
		DeleteByMobileIdException deleteException = new DeleteByMobileIdException();
		throw deleteException;
	}

	@Override
	public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber) {

		Iterator<MobileDTO> iterator = mobileDto.iterator();
		while (iterator.hasNext()) {
			MobileDTO mobile = iterator.next();
			if (mobile.getSerialNumber() == oldSerailNumber) {
				mobile.setSerialNumber(newSerailNumber);
				return mobile;
			}
		}
		UpdateBySerialNumberExcxeption updateException = new UpdateBySerialNumberExcxeption();
		throw updateException;
	}

}
