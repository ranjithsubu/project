package ExampleComparisionOperators;

public class ExampleMinimumNumber {
	public static void main(String[] args) {
		int a = 10;
		int b = 40;
		int c = minimumvalue (a,b);

		System.out.println("Minimum value"+ c);
	}
	public static int minimumvalue(int number1, int number2) {
		int minimum;
		if (number1>number2)
			minimum = number2;
		else
			minimum = number1;
			return minimum;
	}
		}





