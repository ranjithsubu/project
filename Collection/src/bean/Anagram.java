package bean;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "hey yeu";
		String s2 = "yeh oyu";
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();
		Arrays.sort(a);
		Arrays.sort(b);
		boolean result = Arrays.equals(a, b);
		if (result == true) {
			System.out.println("is anagram");
		} else {
			System.out.println("is not anagram");
		}

	}
}
