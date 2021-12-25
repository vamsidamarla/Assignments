package src.thoughtFocus.tv.narrowing;

public class NarrowingTest {
	public static void main(String[] args) {
		long tvPrice = 50000l;
		short price = (short) tvPrice; // long to short
		int price1 = (int) tvPrice; // long to int
		float fprice = (float) tvPrice; // long to float

		System.out.println(fprice);
		System.out.println(price);
		System.out.println(price1);

		int ram = 8;
		byte tvRAM = (byte) ram; // int to byte
		char chr = (char) ram; // int to char

		System.out.println(tvRAM);
		System.out.println(chr);
	}
}