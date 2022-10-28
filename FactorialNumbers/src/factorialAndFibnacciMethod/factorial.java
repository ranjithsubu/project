package factorialAndFibnacciMethod;

public class factorial {
	public static int factorial(int a) {
		while (a == 0)
			return 1;
		return a * factorial(a - 1);
	}

	public static void main(String[] args) {
		int a = 5;
		System.out.println(factorial(a));
	}

}
