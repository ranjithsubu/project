package ExampleComparisionOperators;
public class OddOrEven {

	public static void main(String[] args) {
		 Numbers(16);
		
	}

	public static int Numbers(int number) {
		int sum = 0, add = 0;
		for (int i = 0; i < number; i++) {
			if (i % 2 == 1) {
				sum = sum + i;
			} else {
				add = add + i;

			}
		}
			System.out.println("sum of even numbers"+sum);
			System.out.println("sum of odd numbers"+add);

		

		return number;
	}
}
