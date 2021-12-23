package exception.com.thoughtFocus.outOfBound;

import java.lang.ArrayIndexOutOfBoundsException;

public class Test {
	public static void main(String[] args) {
		OutOfBound test = new OutOfBound();
		test.save("vamsi");
		test.save("anand");
		test.printAll();
		test.save("ram");

	}
}
