package arrays.com.thoughtFocus.months;

public class MonthsTest {
	public static void main(String[] args) {
		Months month = new Months();
		month.save("January");
		month.save("February");
		month.save("Mar");
		month.save("April");
		month.save("May");
		month.save("June");
		month.save("July");
		month.save("August");
		month.save("September");
		month.save("october");
		month.save("November");
		month.save("December");
		month.save("thoughtfocus");

		month.printAll();

		System.out.println("---------------");

		String status1 = month.delete("November");
		String status = month.delete("December");
		String status2 = month.delete("october");

		System.out.println(status1);
		System.out.println(status2);
		System.out.println(status);
		System.out.println("---------------");

		month.printAll();
		System.out.println("---------------");

		String updateMonth = month.update("Mar", "March");

		System.out.println(updateMonth);
		System.out.println("---------------");

		month.printAll();
	}
}
