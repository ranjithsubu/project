package methodsExampleArithmeticoperators;

public class MethodExampleaddition {

	public static int Addition(int a, int b) {

		int c = a + b;
		return c;
	}

	public static int Subtraction(int a, int b) {
		int d = a - b;
		return d;
	}

	public static int Multiplication(int a, int b) {
		int e = a * b;
		return e;
	}

	public static int Division(int a, int b) {
		int f = a / b;
		return f;
	}

	public static void main(String[] args) {
		int c = Addition(10, 20);
		System.out.println(c);
		int d = Subtraction(10, 20);
		System.out.println(d);
		int e = Multiplication(10, 20);
		System.out.println(e);
		int f = Division(10, 20);
		System.out.println(f);




	}
}
