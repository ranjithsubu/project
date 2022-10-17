package ExampleComparisionOperators;

public class OddNumbers {

	public static void main(String[] args) {
		int addition = oddNumbers(1, 10);
		System.out.println(addition);
	}

	public static int oddNumbers(int a, int b) {
		int c = 0;
		if (a > b) {
			int temp = a;
			a = b;
			b = temp;
		}
		for (int i = a; i < b; i++) {
			if (i % 2 != 0) {
				c = c + i;
			}
		}
		return c;
	}
}
