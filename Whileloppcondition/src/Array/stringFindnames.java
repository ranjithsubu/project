package Array;

import java.util.Scanner;

public class stringFindnames {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the length value");
		int length = scanner.nextInt();
		String array[] = new String[length];

		for (int i = 0; i < array.length; i++) {
			scanner = new Scanner(System.in);
			System.out.println("enter tha names");
			String value = scanner.nextLine();
			array[i] = value;
		}
		System.out.println("find the name");
		String findname = scanner.nextLine();
		int count = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i].equals(findname))
				count++;

		}
		System.out.println(count);
	}

}
