package ExampleString;

public class StringReverseArray {
	public static String reverseString(String name) {
		char array[] = (name.toCharArray());
		String country = "";
		for (int i = array.length - 1; i >= 0; i--) {
			country = country + array[i];
		}

		return country;

	}

	public static void main(String[] args) {
		System.out.println(reverseString("Dharmapuri"));
	}

}
