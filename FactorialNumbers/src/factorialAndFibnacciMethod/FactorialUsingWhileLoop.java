package factorialAndFibnacciMethod;

public class FactorialUsingWhileLoop {
	public static int factorial(int number) {
		int factorial = 1;
		int i = 1;
		while (i <= number) {
			factorial = factorial * i;
			i++;
		}
		return factorial;

	}

	public static void main(String[] args) {
		System.out.println(factorial(10));
	}

}