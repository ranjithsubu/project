package ArrayMethodTypes;

import java.util.Scanner;
import java.util.concurrent.SynchronousQueue;

public class arrayMethods {
	public static int[] prepareData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length value");
		int length = sc.nextInt();
		int array[] = new int[length];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter the array value");
			int input = sc.nextInt();
			array[i] = input;

		}
		return array;

	}

	public static int[] sortarray(int[] inputarray) {
		for (int i = 0; i < inputarray.length; i++) {
			for (int j = i + 1; j < inputarray.length; j++) {
				int temp = inputarray[i];
				inputarray[i] = inputarray[j];
				inputarray[j] = temp;

			}
		}
		return inputarray;

	}

	public static void printarray(int[] sortarray) {
		for (int i = 0; i < sortarray.length; i++) {
			System.out.println(sortarray[i]);
		}
	}

	public static boolean findNumber(int[] array, int findNumber) {
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == findNumber) {
				count++;
				return true;
				

			}
		}
		return false;
	}

	public static int sumOfEvenNumbersinarray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("even numbers is" + array[i]);
				sum = sum + array[i];
			}
		}
		return sum;
	}

	public static int sumOfOddNumbersinarray(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println("odd numbers is" + array[i]);
				sum = sum + array[i];
			}
		}return sum;

	}

	public static void main(String[] args) {
    	 int[]inputarray = prepareData();
    	 int[]sortedarray = sortarray(inputarray);
    	 printarray(sortedarray);
    	 Scanner sc = new Scanner(System.in);
    	 System.out.println("enther the number to find");
    	 int findNumber = sc.nextInt();
    	 boolean isExist = findNumber(sortedarray,findNumber );
    	 if (isExist){
    		 System.out.println("number is found");
    	 }else {
    		 System.out.println("number is not found");
    	 }
    	 int evenNumberssum  = sumOfEvenNumbersinarray(sortedarray);{
    		 System.out.println("sum of even numbers"+evenNumberssum);
    	 }
    	 int oddNumberssum = sumOfOddNumbersinarray(sortedarray);{
    		 System.out.println("sum of odd numbers"+ oddNumberssum);
    	 }
	}

}
