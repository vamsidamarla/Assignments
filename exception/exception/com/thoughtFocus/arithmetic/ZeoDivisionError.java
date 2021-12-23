package exception.com.thoughtFocus.arithmetic;

import java.lang.ArithmeticException;

public class ZeoDivisionError {
	public static void main(String[] args) {
		try {
			int a = 10;
			int b = 0;
			System.out.println(a / b);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Denominator cant be zero");
		}

	}
}
