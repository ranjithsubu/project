package Array;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the length");
		
		int length = scanner.nextInt();
		int array[] = new int [length];
		for (int i = 0;i<array.length; i++)
		{
			System.out.println("enter the value");
			int value = scanner.nextInt();
			 array[i]=value;
			
			}
		System.out.println(array[4]);	
	
}
	
	
}
