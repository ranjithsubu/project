package ExampleString;

public class FirstRepeatedChar {
	public static char firstRepeatedChar(String word) {
		char[] array = word.toCharArray();
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					return array[i];
				}

			}

		}

		return 0;
	}

	public static void main(String[] args) {
		System.out.println(firstRepeatedChar("geekforgeeks"));
	}
}
