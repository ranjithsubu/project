package factorialAndFibnacciMethod;

public class CollectionExample1 {

	public static void main(String[] args) {
		String input = "moon sun \"jupiter is a largest planet\" pluto saturan";
		String temp = "";
		String array[] = new String[5];
		int arrayIndex = 0;
		int doublequotescounter = 0;
		for (int i = 0; i < input.length(); i++) {
			if (input.charAt(i) == '"') {
				doublequotescounter++;
			} else if (doublequotescounter % 2 == 0 && input.charAt(i) == ' ') {
				array[arrayIndex++] = temp;
				temp = "";
			} else {
				temp = temp + input.charAt(i);
			}
		}
		array[arrayIndex] = temp;
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}
}
