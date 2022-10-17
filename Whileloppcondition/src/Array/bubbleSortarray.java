package Array;

import java.util.Scanner;

public class bubbleSortarray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length");
		int length = scanner.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println(" Enter the Elements in array");
			int value = scanner.nextInt();
			array[i] = value;
		}
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] > array[j]) {

					int temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.println(array[i]);
		}

	}

}
