package Array;

public class findNumber {
	public static void main(String[] args) {
		int numbers[] = { 2, 3, 4, 5, 6, 6, 8, 9 };
		boolean isExist = false;
		int findNumber = 6;
		for (int i = 0; i < numbers.length; i++) {
			if (findNumber == numbers[i]) {
				isExist = true;

			}
		}
		if (isExist == true) {
			System.out.println(findNumber + " is present Array");
		} else {
			System.out.println(findNumber + " not present Array");
		}
	}
}
