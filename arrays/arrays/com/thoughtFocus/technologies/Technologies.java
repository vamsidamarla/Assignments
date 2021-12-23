package arrays.com.thoughtFocus.technologies;

public class Technologies {
	String[] technologies = new String[15];
	private int index = 0;

	public void printAll() {
		for (int index = 0; index < technologies.length; index++) {
			if (technologies[index] != null) {
				System.out.println(technologies[index]);
			}
		}
	}

	public boolean save(String language) {
		if (index < 15) {
			if (language != "") {
				technologies[index] = language;
				index++;
				return true;
			} else {
				System.out.println("Language is not added");
				return false;

			}
		}
		return false;

	}

	public String delete(String language) {
		for (int index = 0; index < technologies.length; index++) {
			if (technologies[index] != null) {
				if (technologies[index].equals(language)) {
					technologies[index] = null;
					return language + " is deleted";
				}
			}
		}
		return "language not found";

	}

	public String update(String oldName, String newName) {
		for (int index = 0; index < technologies.length; index++) {
			if (technologies[index] != null) {
				if (technologies[index].equals(oldName)) {
					technologies[index] = newName;
					return oldName + " is updated to " + newName;
				}
			}
		}
		return oldName + " is not updated";
	}
}
