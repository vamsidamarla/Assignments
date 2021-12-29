package com.thoughtfocus.map;

import java.util.Map;
import java.util.TreeMap;

public class MobileDAO {
	Map<String, MobileDTO> mapDto = new TreeMap<String, MobileDTO>();

	public boolean save(String name, MobileDTO dto) {
		if (dto.getMobileId() != 0 && dto.getSerialNumber() != 0) {
			mapDto.put(name, dto);
			return true;
		} else {
			return false;
		}
	}

	public void getByKey(String key) {
		if (!mapDto.isEmpty()) {
			if (mapDto.containsKey(key)) {
				System.out.println(mapDto.get(key));
			} else {
				System.out.println("No items to show...");
			}
		} else {
			System.out.println("mobile list is empty");
		}

	}

	public MobileDTO deleteByKey(String key) {
		if (mapDto.containsKey(key)) {
			return mapDto.remove(key);

		} else {
			DeleteException exception = new DeleteException();
			throw exception;
		}

	}

	public MobileDTO updatePriceByKey(String key) {
		if (mapDto.containsKey(key)) {
			MobileDTO object = mapDto.get(key);
			object.setPrice(99999);
			return object;
		} else {
			UpdatePriceByKeyException exception = new UpdatePriceByKeyException();
			throw exception;
		}
	}
}
