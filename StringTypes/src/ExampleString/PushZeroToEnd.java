package ExampleString;

public class PushZeroToEnd {
	public static int[] Pushingzero(int[] inputarray, int length) {
		int count = 0;
		for (int i = 0; i < inputarray.length; i++) {
			if (inputarray[i] != 0) {
				inputarray[count++] = inputarray[i];
			}
		}
		while (count < length) {
			inputarray[count++] = 0;
		}
		return inputarray;
	}
	public static void main(String[] args) {
		int[] inputarray = { 25, 16, 0, 23, 10, 0, 89 };
		int[] output = Pushingzero(inputarray, 7);
		for (int i = 0; i < output.length; i++) {
			System.out.println(output[i]);
		}
	}
}