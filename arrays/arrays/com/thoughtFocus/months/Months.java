package arrays.com.thoughtFocus.months;

import java.util.Iterator;

public class Months {
	String[] months = new String[12];
	private int index = 0;

	public void printAll() {
		for (int index = 0; index < months.length; index++) {
			if (months[index] != null) {
				System.out.println(months[index]);
			}
		}
	}

	public boolean save(String month) {
		if (index < 12) {
			if (month != "") {
				months[index] = month;
				index++;
				return true;
			} else {
				System.out.println("Month is not added");
				return false;
			}
		}
		return false;
	}

	public String delete(String month) {
		for (int index = 0; index < months.length; index++) {
			if (months[index] != null) {
				if (months[index].equals(month)) {
					months[index] = null;
					return month + " is deleted";
				}
			}

		}
		return "Month not found";

	}

	public String update(String oldName, String newName) {
		for (int index = 0; index < months.length; index++) {
			if (months[index] != null) {
				if (months[index].equals(oldName)) {
					months[index] = newName;
					return oldName + " is updated to " + newName;
				}
			}
		}
		return oldName + " is not updated";
	}
}
