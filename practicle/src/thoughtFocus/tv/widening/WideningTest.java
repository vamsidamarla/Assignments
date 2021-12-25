package src.thoughtFocus.tv.widening;

public class WideningTest {
	public static void main(String[] args) {
		byte ram = 4;
		int RAM = ram; // byte to int

		int price = 35000;
		double tvPrice = price; // int to double

		short storage = 32;
		int storageGb = storage; // short to int

		System.out.println(RAM);
		System.out.println(tvPrice);
		System.out.println(storageGb);
	}
}
