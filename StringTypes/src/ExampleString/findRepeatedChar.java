package ExampleString;

public class findRepeatedChar {

	public static void main(String[] args) {
		String input = "ranjith is a bad boy";
		char find = 'a';
		int count = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == 'a') {
				count++;

			}
		}
		System.out.println("the char find " + find + " " + count + "times");

	}

}
