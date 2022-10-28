package Class;

public class Mobile {
	public Mobile(String name, int ram, float size, int price) {
		super();
		this.name = name;
		this.ram = ram;
		this.size = size;
		this.price = price;
	}

	String name;
	int ram;
	float size;
	int price;

	
	public Mobile() {
		System.out.println("defalut constructor");
	}

	public void  makeCall(int Number) {
		System.out.println("calling");
	}

	public static void main(String[] args) {
		Mobile m1 = new Mobile("mi", 8, 16.5f, 15000);
		System.out.println(m1.name);
		System.out.println(m1.size);
		System.out.println(m1.price);
		System.out.println(m1.ram);
		Mobile m2 = new Mobile();

	}

}
