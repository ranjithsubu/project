package Class;

public class classNameException {
	public void printnumber() {
		//System.out.println("ijyj");
		try {
		System.out.println("beforeexception");
		int i = 10 / 0;
		System.out.println("afterexceptio");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("hi");
		}
	
	}
	public static void main(String[] args) {
		classNameException a = new classNameException();
		a.printnumber();
		System.out.println("hey");

	}

}
