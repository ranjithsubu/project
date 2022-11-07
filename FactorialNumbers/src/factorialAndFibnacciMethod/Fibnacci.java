
package factorialAndFibnacciMethod;

public class Fibnacci {

	public static void FibnacciNumber(int count) {
		int a = 0;
		int b = 1;
		int c;
		System.out.println(a + "" + b);
		for (int i = 0; i < count; i++) {
			c = a + b;
			System.out.println("" + c);
			a = b;
			b = c;
		}
	}

	public static void main(String[] args) {

		FibnacciNumber(10);
	}
}