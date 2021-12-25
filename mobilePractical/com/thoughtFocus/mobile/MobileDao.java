package com.thoughtFocus.mobile;

public class MobileDao extends Mobile {
	MobileDTO[] mobileDto = new MobileDTO[10];
	private int index = 0;

	@Override
	public void add(MobileDTO dto) {
		if (dto.getMobileId() != 0 && dto.getSerialNumber() != 0) {
			mobileDto[index] = dto;
			index++;
		}
	}

	@Override
	public void getAll() {
		for (int index = 0; index < mobileDto.length; index++) {
			if (mobileDto[index] != null) {
				System.out.println(mobileDto[index]);
			}
		}
	}

	@Override
	public void getAllByBrandName(String brandName) {
		for (int index = 0; index < mobileDto.length; index++) {
			if (mobileDto[index] != null) {
				if (mobileDto[index].getBrandName().equals(brandName)) {
					System.out.println(mobileDto[index]);
				}
			}

		}

	}

	@Override
	public MobileDTO deleteByMobileID(long mobileId) {
		for (int index = 0; index < mobileDto.length; index++) {
			if (mobileDto[index] != null) {
				if (mobileDto[index].getMobileId() == mobileId) {
					MobileDTO obj = mobileDto[index];
					mobileDto[index] = null;
					return obj;
				}
			}
		}
		DeleteByMobileIdException deleteException = new DeleteByMobileIdException();
		throw deleteException;
	}

	@Override
	public MobileDTO updateBySerialNumber(long oldSerailNumber, long newSerailNumber) {
		for (int index = 0; index < mobileDto.length; index++) {
			if (mobileDto[index] != null) {
				if (mobileDto[index].getSerialNumber() == oldSerailNumber) {
					mobileDto[index].setSerialNumber(newSerailNumber);
					MobileDTO updated = mobileDto[index];
					return updated;
				}
			}
		}
		UpdateBySerialNumberExcxeption updateException = new UpdateBySerialNumberExcxeption();
		throw updateException;
	}

}
