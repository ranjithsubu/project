package Class;

import java.util.Scanner;

public class FindMissingNumber {
	int missingnumber;
	int n;
	int sumofnumbers;

	public FindMissingNumber(int n) {
		sumofnumbers = (n * (n + 1)) / 2;
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int[] array = new int[n - 1];
		for (int i = 0; i < array.length; i++) {
			System.out.println("enter the numbers");
			int values = sc.nextInt();
			array[i] = values;
			sum = sum + array[i];
		}
		missingnumber = sumofnumbers - sum;
		// System.out.println(sum);
		// System.out.println(sumofnumbers);

	}

	public static void main(String[] args) {
		FindMissingNumber number = new FindMissingNumber(5);
		System.out.println(number.missingnumber);

	}

}
