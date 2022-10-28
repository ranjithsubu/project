package Class;

public class StringConstantPoolAndHeapMemory {

	public static void main(String[] args) {
		String s1 = "India";
		String s2 = "India";
		if (s1 == s2)// true {
			System.out.println(s1);
		String s3 = new String("India");
		if (s1.equals(s3)) {
			System.out.println(s3);
		}

	}
}
