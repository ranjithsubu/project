package ArrayMethods;

import java.util.Scanner;

public class SortArrayMethods {
	public static int[] SortArrayData() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length value");
		int length = scanner.nextInt();
		int Array[] = new int[length];
		for (int i = 0; i < Array.length; i++) {
			System.out.println("Enter the Array value");
			int Number = scanner.nextInt();
			Array[i] = Number;

		}
		return Array;

	}

	public static int[] sortArray(int[] inputArray) {
		for (int i = 0; i < inputArray.length; i++) {
			for (int j = i + 1; j < inputArray.length; j++) {
				int temp = inputArray[i];
				inputArray[i] = inputArray[j];
				inputArray[j] = temp;

			}
		}
		return inputArray;

	}

	public static void printArray(int[] sortArray) {
		for (int i = 0; i < sortArray.length; i++) {
			System.out.println(sortArray[i]);
		}
	
		
	}

	public static void main(String[] args) {
		int[] inputArray = SortArrayData();
		int[] sortArray = sortArray(inputArray);

		;
		printArray(sortArray);
		

	}

}
