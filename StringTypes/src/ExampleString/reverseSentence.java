package ExampleString;

public class reverseSentence {

	public static void main(String[] args) {
		String[]input = "hey you are looking so cute dear".split(" ");
		String ans  = "";
		for(int i = input.length-1;i>=0;i-- ) {
			ans = ans + input[i] +" ";
		}
		System.out.println(ans);


	}

}
