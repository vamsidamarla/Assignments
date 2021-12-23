package exception.com.thoughtFocus.outOfBound;

import java.lang.ArrayIndexOutOfBoundsException;

public class OutOfBound {
	String[] employeeName = new String[2];
	int index = 0;

	public void save(String name) {
		try {
			if (name != "") {
				employeeName[index] = name;
				index++;
			} else {
				System.out.println("provide a valid name");
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}

	}

	public void printAll() {
		for (int index = 0; index < employeeName.length; index++) {
			if (employeeName[index] != null) {
				System.out.println("employee name : " + employeeName[index]);
			}
		}
	}
}
