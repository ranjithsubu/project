package ExampleString;

public class PalindromeCheck {
	public static boolean palindrome(String name) {
		String reverse = StringReverseArray.reverseString(name);
		if (name.equalsIgnoreCase(reverse)) {
			return true;
		}

		return false;
	}

	public static void main(String[] args) {
		boolean output = palindrome("Madam");

		if (output) {
			System.out.println("is palindrome");
		} else {
			System.out.println(" is not palindrome");
		}

	}

}
