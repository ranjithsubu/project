package ExampleString;

public class PalindromeSplit {
	public static String palindromeString(String input) {
		String reverseString = "";
		String array[] = input.split(" ");
		for (int i = 0; i < array.length; i++) {
			String reverseword = StringReverseArray.reverseString(array[i]);
			reverseString = reverseString + reverseword + " ";
		}
		return reverseString.trim();
	}

	public static void main(String[] args) {
		String result = palindromeString("Hi i am busy");
		System.out.println(result);
	}

}
