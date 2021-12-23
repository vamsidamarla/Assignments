package arrays.com.thoughtFocus.technologies;

public class Test {
	public static void main(String[] args) {
		Technologies technologies = new Technologies();
		technologies.save("HTML");
		technologies.save("CSS");
		technologies.save("Java");
		technologies.save("Javascript");
		technologies.save("python");
		technologies.save("reactjs");
		technologies.save("nodejs");
		technologies.save("SQL");
		technologies.save("angularjs");
		technologies.save("c");
		technologies.save("c++");
		technologies.save("nodejs");
		technologies.save("hybernate");
		technologies.save("r language");
		technologies.save("mongodb");

		technologies.printAll();

		System.out.println("-------------- ");

		String item = technologies.delete("python");
		String item1 = technologies.delete("c");
		String item2 = technologies.delete("Java");
		String item3 = technologies.delete("mongodb");

		System.out.println(item);
		System.out.println(item1);
		System.out.println(item2);
		System.out.println(item3);

		System.out.println("-------------- ");

		technologies.printAll();

		System.out.println("-------------- ");

		String updatedItem = technologies.update("r language", "Spring");
		System.out.println(updatedItem);

		System.out.println("-------------- ");

		technologies.printAll();

	}
}
