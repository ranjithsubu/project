package ExampleString;

public class ReverseLowercaseWithUppercase {
	public static String reverseString(String name) {
		String output = "";
		String reverseString = name.toLowerCase();
		String[] array = reverseString.split(" ");
		int lastname = array.length - 1;
		for (int i = 0; i < array.length; i++) {
			if (i == lastname) {
				String lastword = array[lastname];
				char[] upper = lastword.toCharArray();
				String reversename = "";
				for (int j = upper.length - 1; j >= 0; j--) {
					reversename = reversename + upper[j];
					
				}array[lastname] = reversename;
			}
			output = output + array[i].concat(" "); 
		}
		return output;
	}

	public static void main(String[] args) {
		String a = reverseString("T20 Worldcup Happing in Australia");
		System.out.println(a);

	}
}
